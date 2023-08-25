package Examclouds.Generics;

import java.io.Serializable;

public class TestGenerics<T extends Comparable, V extends Animal&Serializable, K extends Number> {
    private T variable1;
    private V variable2;
    private K variable3;

    public TestGenerics(T variable1, V variable2, K variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public T getVariable1() {
        return variable1;
    }

    public V getVariable2() {
        return variable2;
    }

    public K getVariable3() {
        return variable3;
    }

    public void getVariableClass() {
        System.out.println("variable1 : " + variable1.getClass());
        System.out.println("variable2 : " + variable2.getClass());
        System.out.println("variable3 : " + variable3.getClass());
    }
}

class Animal implements Serializable{
}
class Dog extends Animal{

}

class Test {
    public static void main(String[] args) {
        TestGenerics<Integer, Animal, Double> testGenerics = new TestGenerics<>(15, new Dog(), 3.14);
        testGenerics.getVariableClass();
    }
}