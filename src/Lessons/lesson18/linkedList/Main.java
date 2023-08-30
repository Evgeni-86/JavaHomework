package Lessons.lesson18.linkedList;

public class Main {
    public static void main(String[] args) {
        NodeList<Integer> integerNodeList = new NodeList<>();

        integerNodeList.add(5);
        integerNodeList.add(7);
        integerNodeList.add(9);
        integerNodeList.add(15);


        System.out.println(integerNodeList.printAll());

        integerNodeList.removeByIndex(3);

        System.out.println(integerNodeList.printAll());

        System.out.println(integerNodeList.getSize());
    }
}
