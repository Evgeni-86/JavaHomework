package Examclouds.PrintableInterface;

public class Main {
    public static void main(String[] args) {
        Printable[] printablesArr = greateArr(10);
        for (Printable elem : printablesArr) {
            elem.print();
        }

        Magazine.printMagazines(printablesArr);
        Book.printBooks(printablesArr);
    }

    static Printable[] greateArr(int num) {
        Printable[] outArr = new Printable[num];
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                outArr[i] = new Book();
            } else {
                outArr[i] = new Magazine();
            }
        }
        return outArr;
    }
}
