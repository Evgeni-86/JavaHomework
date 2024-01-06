package javaRash;

/*
Цепочка конец-начало слова
* */

import java.util.*;

public class WordsChaining {
    public static void main(String[] args) {

//        String[] strings = {"нигерия","амстердам", "киев", "амстердам", "нью-йорк",
//                "амстердам", "вена", "мельбурн", "киров", "москва","азер", "нигерия", "нью-йорк", "венера"};

        String[] strings = {"нигерия", "амстердам", "киев", "амстердам", "нью-йорк",
                "амстердам", "вена", "мельбурн", "киров", "москва", "азер", "нигерия", "нью-йорк", "венера"};


        List<String> stringList = null;
        int mazSizeTemp = 0;
        for (String string : strings) {
            List<String> res = test2(string, strings);
            System.out.println(res);
            System.out.println("--------------------------------");
            if (res.size() > mazSizeTemp) {
                stringList = res;
                mazSizeTemp = res.size();
            }
        }
        System.out.println("=====RESULT=====================");
        System.out.println(stringList);
    }

    public static List<String> test2(String word, String[] strings) {

        Stack<Edge> stringStack = new Stack<>();
        Edge startEdge = new Edge();
        startEdge.value = word;
        startEdge.stringList.add(word);
        stringStack.add(startEdge);

        int maxSizeTemp = 0;
        List<String> stringList = null;

        while (!stringStack.isEmpty()) {
            Edge current = stringStack.pop();
            char lastChar = current.value.charAt(current.value.length() - 1);

            int countAdd = 0;
            for (String string : strings) {
                if (current.stringList.contains(string))
                    continue;
                if (string.charAt(0) == lastChar) {
                    Edge newEdge = new Edge();
                    newEdge.value = string;
                    newEdge.stringList.addAll(current.stringList);
                    newEdge.stringList.add(string);
                    stringStack.add(newEdge);
                    countAdd++;
                }
            }
            if (countAdd == 0 && current.stringList.size() > maxSizeTemp) {
                maxSizeTemp = current.stringList.size();
                stringList = current.stringList;
            }
        }
        return stringList;
    }

    public static class Edge {
        String value;
        List<String> stringList = new ArrayList<>();
    }
}