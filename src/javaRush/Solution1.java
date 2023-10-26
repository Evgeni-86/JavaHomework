import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int secondMin = 0;
        int counter = 0;

        while (scanner.hasNextInt()) {
            int current = scanner.nextInt();
            if (counter > 0) {
                if (current < min) {
                    secondMin = min;
                    min = current;
                } else if (current < secondMin && current != min) {
                    secondMin = current;
                }
            } else {
                min = current;
                secondMin = current;
            }
            System.out.println(min + " : " + secondMin);
            counter++;
        }
        System.out.println(secondMin);
    }
}