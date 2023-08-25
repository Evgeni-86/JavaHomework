package patternsProject.structuralPatterns.adapter;

public class SomeInterfaceOneRunner {

    public static void main(String[] args) {
        InterfaceOne interfaceOne = new AdapterInterfaceOneToJavaApp();

        interfaceOne.operation1();
        interfaceOne.operation2();
    }

}
