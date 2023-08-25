package streem;

import java.util.*;
import java.util.stream.Collectors;

public class streemMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("sas");
        list.add("gfgfg");
        list.add("syyyyyyys");
        list.add("kkk");
        list.add("ff");

        List<Integer> list2 = list.stream().map(elem -> elem.length()).collect(Collectors.toList());
        System.out.println(list2);

        //--МАССИВ В СТРИМ------------------
        int[] nums = {1, 2, 4, 9, 6};
        nums = Arrays.stream(nums).map(elem -> {
            if (elem%3 == 0){
                elem = elem / 3;
            }
            return elem;
        }).toArray();
        System.out.println(Arrays.toString(nums));

        //--SET------------------------------
        Set<String> set = new TreeSet<>(list);
        System.out.println(set);

        Set<Integer> set2 = set.stream().map(elem -> elem.length()).collect(Collectors.toSet());
        List<Integer> integers1 =  set.stream().map(elem -> elem.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(integers1);
    }
}
