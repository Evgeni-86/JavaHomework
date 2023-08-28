package streem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class reduce {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        int result = integerList.stream().reduce( (accumulator, elem) -> accumulator * elem).get();
        System.out.println(result);

        Optional<Integer> optionalInteger = integerList.stream().reduce( (accum, elem) -> accum * elem);
        if (optionalInteger.isPresent()){
            int rez= optionalInteger.get();
            System.out.println(rez);
        }
    }

}
