package Lessons.lesson18.linkedList;

import java.util.concurrent.atomic.AtomicInteger;

public class NodeList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;
    private int counter = 0;

    public T add(T node) {
        Node<T> newNode = new Node<>(node);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);//текущий хвост для нового элемента становиться предыдущим элементом
        }
        tail = newNode;
        size++;
        return newNode.getValue();
    }

    public void remove(T elementToRemove) {
        runByElements(elem -> {
            if (elem.getValue().equals(elementToRemove)) {
                updateLinks(elem);
                size--;
            }
        });
    }

    public void removeByIndex(int index) {
        runByElements(elem -> {
            if (index == counter){
                updateLinks(elem);
                size--;
            }
            counter++;
        });
        counter = 0;
    }

    private void updateLinks(Node<T> elementToRemove){
        Node<T> prevElement = elementToRemove.getPrev();
        Node<T> nextElement = elementToRemove.getNext();
        if (prevElement != null) {
            prevElement.setNext(nextElement);
        } else {
            head = head.getNext();
        }
        if (nextElement != null) {
            nextElement.setPrev(prevElement);
        }
    }

    public String printAll() {
        StringBuilder out = new StringBuilder();
        runByElements(elem -> out.append(elem.getValue() + " "));
        return out.toString();
    }

    public int getSize() {
        return size;
    }

    private void runByElements(optionsElement<T> func) {
        Node<T> currentElem = head;
        while (currentElem != null) {
            func.someDo(currentElem);
            currentElem = currentElem.getNext();
        }
    }

    interface optionsElement<T> {
        void someDo(Node<T> elem);
    }

}
