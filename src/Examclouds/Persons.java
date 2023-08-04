package Examclouds;

class Persons {
    String fullname;
    int age;

    Persons(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    Persons() {
    }

    //--------------------------------------------------------
    void move() {
        System.out.println(fullname + " двигается");
    }

    void talk() {
        System.out.println(fullname + " говорит");
    }
}

class Test {
    public static void main(String[] args) {
        Persons persons1 = new Persons("Ivan", 20);
        Persons persons2 = new Persons();
        persons1.move();
        persons1.talk();
    }
}
