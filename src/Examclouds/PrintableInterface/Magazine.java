package Examclouds.PrintableInterface;

public class Magazine implements Printable {
    @Override
    public void print() {
        System.out.println("The Magazine");
    }

    static void printMagazines(Printable[] printable) {
        for (Printable elem : printable) {
            if (elem instanceof Magazine) {
                elem.print();
            }
        }
    }
}
