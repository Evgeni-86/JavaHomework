package Kodesource;
//УНИКАЛЬНОЕ ТРЕХЗНАЧНОЕ ЧИСЛО
public class T39 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        StringBuilder out = new StringBuilder("");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                for (int k = 0; k < numbers.length; k++) {

                    if (k != j && k != i && j != i) {
                        out.append("" + numbers[k] + numbers[j] + numbers[i] + ",");
                    }

                }

            }

        }

        String[] conStr = out.toString().split(",");
        for (String elem : conStr) {
            System.out.println(elem);
        }
        System.out.println(conStr.length);
    }
}
