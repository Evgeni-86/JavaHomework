/*148. Напишите программу на Java, чтобы найти индекс первого уникального
символа в данной строке, предположим, что в строке есть хотя бы один уникальный символ.
Пример вывода:
Исходная строка: wesource
Первый уникальный персонаж из вышеперечисленного: 0*/

package Kodesource;
import java.util.*;
import java.util.stream.Stream;

public class T148 {
    public static void main(String[] args) {
        String s = "eourceo";
        test(s);
    }

    public static void test(String s) {

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (characterIntegerMap.containsKey(character)) {
                characterIntegerMap.remove(character);
            } else {
                characterIntegerMap.put(character, i);
            }
        }
//        if (characterIntegerMap.size() > 0) {
//            Integer integerStream = characterIntegerMap.values().stream().min(Integer::compareTo).get();
//            System.out.println(integerStream);
//        }

        if (characterIntegerMap.size() > 0) {
            Map.Entry<Character,Integer> rez =  characterIntegerMap.entrySet().stream().
                    min((el1, el2) -> el1.getValue() - el2.getValue()).get();
            System.out.println(rez.getKey());
            System.out.println(rez.getValue());
        }

//        Iterator<Map.Entry<Character,Integer>> iterator = characterIntegerMap.entrySet().iterator();
//        if(iterator.hasNext()){
//            Map.Entry<Character,Integer> rez = iterator.next();
//            System.out.println(rez.getKey());
//            System.out.println(rez.getValue());
//        }
    }

}
