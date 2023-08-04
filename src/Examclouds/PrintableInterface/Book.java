package Examclouds.PrintableInterface;

public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("The Book");
    }

    static void printBooks(Printable[] printable) {
        for (Printable elem : printable) {
            if (elem instanceof Book) {
                elem.print();
            }
        }
    }
}
