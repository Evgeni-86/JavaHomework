package javaRash.abstractList;

import java.io.Serializable;
import java.util.*;

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    private int size;

    public CustomTree(Entry<String> root) {
        this.root = root;
        root.newLineRootElement = true;
        size++;
    }

    @Override
    public int size() {
        Stack<Entry<String>> stack = new Stack<>();
        stack.push(root);
        int counter = 0;
        while (stack.size() > 0) {
            Entry<String> currentEntry = stack.pop();
            counter++;
            if (currentEntry.rightChild != null)
                stack.push(currentEntry.rightChild);
            if (currentEntry.leftChild != null)
                stack.push(currentEntry.leftChild);
        }
        return counter;
    }

    @Override
    public String get(int index) {
        Queue<Entry<String>> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            Entry<String> currentEntry = queue.poll();
            if (currentEntry.leftChild != null)
                queue.add(currentEntry.leftChild);
            if (currentEntry.rightChild != null)
                queue.add(currentEntry.rightChild);
        }
        return null;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }


    public Entry<String> getParent(String element) {
        Queue<Entry<String>> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            Entry<String> currentEntry = queue.poll();
            if (currentEntry.elementName.equals(element))
                return currentEntry.parent;
            if (currentEntry.leftChild != null)
                queue.add(currentEntry.leftChild);
            if (currentEntry.rightChild != null)
                queue.add(currentEntry.rightChild);
        }
        return null;
    }

    public void print() {
        Queue<Entry<String>> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            Entry<String> currentEntry = queue.poll();
            if (currentEntry.newLineRootElement && currentEntry != root)
                System.out.println();
            System.out.print(currentEntry.elementName + " ");
            if (currentEntry.leftChild != null)
                queue.add(currentEntry.leftChild);
            if (currentEntry.rightChild != null)
                queue.add(currentEntry.rightChild);
        }
        System.out.println();
    }

    @Override
    public boolean add(String elementName) {
        Entry<String> newElement = new Entry<>(elementName);
        Queue<Entry<String>> queue = new ArrayDeque<>();
        queue.add(root);

        while (queue.size() > 0) {
            Entry<String> currentEntry = queue.poll();
            int newElementValue = Integer.parseInt(newElement.elementName);

            if (!currentEntry.availableToAddLeftChildren) {
                int currentEntryValue = Integer.parseInt(currentEntry.leftChild.elementName);
                if (newElementValue - currentEntryValue < 0) {
                    String tempElementName = currentEntry.leftChild.elementName;
                    currentEntry.leftChild.elementName = newElement.elementName;
                    newElement.elementName = tempElementName;
                }
                queue.add(currentEntry.leftChild);
            }

            if (!currentEntry.availableToAddRightChildren) {
                int currentEntryValue = Integer.parseInt(currentEntry.rightChild.elementName);
                if (newElementValue - currentEntryValue < 0) {
                    String tempElementName = currentEntry.rightChild.elementName;
                    currentEntry.rightChild.elementName = newElement.elementName;
                    newElement.elementName = tempElementName;
                }
                queue.add(currentEntry.rightChild);
            }

            if (currentEntry.isAvailableToAddChildren()) {
                newElement.parent = currentEntry;
                if (currentEntry.availableToAddLeftChildren) {
                    if (currentEntry.newLineRootElement)
                        newElement.newLineRootElement = true;
                    currentEntry.leftChild = newElement;
                    currentEntry.availableToAddLeftChildren = false;
                } else {
                    currentEntry.rightChild = newElement;
                    currentEntry.availableToAddRightChildren = false;
                }
                size++;
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren;
        boolean availableToAddRightChildren;
        boolean newLineRootElement;
        Entry<T> parent;
        Entry<T> leftChild;
        Entry<T> rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            newLineRootElement = false;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
