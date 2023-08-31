package Lessons.lesson18.linkedList;


public class NodeList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private int counter = 0;//для сравнения при обходе (сбрасывается в runByElements)

    public T add(T node) {
        if (node == null) {
            return null;
        }
        Node<T> newNode = new Node<>(node);
        if (head == null) {
            head = newNode;
        } else {
            connectElements(tail, newNode);
        }
        tail = newNode;
        size++;

        return newNode.getValue();
    }

    public T insertByIndex(T elementForInsertion, int index) {
        runByElements(elem -> {
            if (index == counter++) {
                Node<T> insertNode = new Node<>(elementForInsertion);
                connectElements(elem.getPrev(), insertNode);
                connectElements(insertNode, elem);
                size++;
                return true;
            }
            return false;
        });
        return elementForInsertion;
    }

    public T remove(T elementToRemove) {
        runByElements(elem -> {
            if (elem.getValue().equals(elementToRemove)) {
                connectElements(elem.getPrev(), elem.getNext());
                size--;
                return true;
            }
            return false;
        });
        return elementToRemove;
    }

    public void removeByIndex(int index) {
        runByElements(elem -> {
            if (index == counter++) {
                connectElements(elem.getPrev(), elem.getNext());
                size--;
                return true;
            }
            return false;
        });
    }

    private void connectElements(Node<T> elementOne, Node<T> elementTwo) {
        if (elementOne != null) {
            elementOne.setNext(elementTwo);
        } else {
            head = elementTwo;
        }

        if (elementTwo != null) {
            elementTwo.setPrev(elementOne);
        }
    }

    public String printAll() {
        StringBuilder out = new StringBuilder();
        runByElements(elem -> {
            out.append(elem.getValue()).append(" ");
            return false;
        });
        return out.toString();
    }

    public int getSize() {
        return size;
    }

    private void runByElements(elementAction<T> func) {
        Node<T> currentElem = head;
        while (currentElem != null) {
            if (func.someDo(currentElem)) {
                break;
            }
            currentElem = currentElem.getNext();
        }
        counter = 0;
    }

    interface elementAction<T> {
        boolean someDo(Node<T> elem);
    }

}
