package Examclouds.Generics;

public class Calculator {

    private Calculator() {
    }

    ;

    static <T extends Number> Double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    static <T extends Number> Double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
    static <T extends Number> Double divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }
    static <T extends Number> Double subtraction(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}

class TestCalculator{
    public static void main(String[] args) {
        System.out.println(Calculator.sum(123, 12.3));
    }
}



