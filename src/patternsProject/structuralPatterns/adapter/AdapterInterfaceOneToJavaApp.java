package patternsProject.structuralPatterns.adapter;

public class AdapterInterfaceOneToJavaApp extends JavaApp implements InterfaceOne{
    @Override
    public void operation1() {
        metod1();
    }

    @Override
    public void operation2() {
        metod2();
    }
}
