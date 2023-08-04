package Lessons.lesson06.InterfacesTest;

class Human implements Walk, Drive {
    String name;
    String surname;
    int age;
    int distance;

    Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    void info() {
        System.out.println("Имя: " + name + ", Фамилия: " +
                surname + ", Возраст: " + age + ", Пройдено: " + distance);
    }

    public void walk(int num) {
        this.distance += num;
    }

    public void drive() {
        System.out.println("Имя: " + name + ", Фамилия: " +
                surname + " едет на автомобиле");
    }
}
