package patternsProject.behavioralPatterns.iterator;

import java.util.ArrayList;

public class OneAggregate implements SomeAggregate {
    String name;
    ArrayList<Integer> integers;

    public OneAggregate(String name, ArrayList<Integer> integers) {
        this.name = name;
        this.integers = integers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(ArrayList<Integer> integers) {
        this.integers = integers;
    }

    @Override
    public Iterator createIterator() {
        return new integersIterator();
    }

    private class integersIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < integers.size()){
                return true;
            }
            return false;
        }

        @Override
        public Integer next() {
            return integers.get(index++);
        }
    }
}
