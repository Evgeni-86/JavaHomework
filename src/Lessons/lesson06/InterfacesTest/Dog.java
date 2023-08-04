package Lessons.lesson06.InterfacesTest;

class Dog implements Walk {
    String name;
    int age;
    int distance;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("Кличка собаки: " + name + ", Возраст: " + age + ", Пройдено: " + distance);
    }

    public void walk(int num) {
        this.distance += num;
    }
}
