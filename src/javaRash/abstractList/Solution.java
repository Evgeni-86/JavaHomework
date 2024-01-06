package javaRash.abstractList;

import static javaRash.abstractList.CustomTree.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println("15".compareTo("3"));
        System.out.println("5".compareTo("3"));
        Entry<String> root = new Entry<>("0");
        CustomTree customTree = new CustomTree(root);

        customTree.add("1");
        customTree.add("3");
        customTree.add("7");
        customTree.add("15");
        customTree.add("8");
        customTree.add("4");
        customTree.add("9");
        customTree.add("10");
        customTree.add("5");
        customTree.add("11");
        customTree.add("12");
        customTree.add("2");
        customTree.add("6");
        customTree.add("13");
        customTree.add("14");

        System.out.println("size = " + customTree.size());
        customTree.print();

        Entry<String> find =  customTree.getParent("10");
        System.out.println(find.elementName);
    }
}
