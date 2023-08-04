package Examclouds;

class Book{
    String autor;
    String name;
}

class Reader {
    String name;
    int id;
    String faculty;
    String dateOfBirth;
    int phoneNumber;

    void takeBook() {
    }

    void takeBook(int numberBooksTaken) {
        System.out.println(name + " взял: " + numberBooksTaken + " книг");
    }

    void takeBook(String... args) {
        System.out.print(name + " взял: ");
        for (int i = 0; i < args.length; i++) {
            if (args.length == 1 || i == args.length - 1) {
                System.out.print(args[i] + ".");
            } else {
                System.out.print(args[i] + ", ");
            }
        }
        System.out.println();
    }

    void takeBook(Book... args) {
        System.out.print(name + " взял: ");
        for (int i = 0; i < args.length; i++) {
            if (args.length == 1 || i == args.length - 1) {
                System.out.print(args[i].name + ".");
            } else {
                System.out.print(args[i].name + ", ");
            }
        }
        System.out.println();
    }


    void returnBook() {
    }
}
//------------------------------------------------------------------------------------------
class TestReader {
    public static void main(String[] args) {
        Book book1 = new Book();
        Reader[] readers = createArray(20);
        Reader r1 = readers[0];
        r1.name = "Petrov";
        book1.name = "Энциклопедия";
        r1.takeBook("Приключения","Словарь");
        r1.takeBook(book1);
//        printArr(readers);
    }

    //----------------------------------------------------
    static Reader[] createArray(int quantity) {
        Reader[] readerArr = new Reader[quantity];
        for (int i = 0; i < quantity; i++) {
            readerArr[i] = new Reader();
        }
        return readerArr;
    }

    static void printArr(Reader[] args) {
        for (Reader elem : args) {
            System.out.println(elem);
        }
    }
}