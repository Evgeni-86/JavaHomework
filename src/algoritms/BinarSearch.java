package algoritms;

public class BinarSearch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int num = 5;

        int start = 0;
        int end = numbers[numbers.length - 1];
        int medium = (start + end) / 2;

        while (num != numbers[medium]) {
            if (num > numbers[medium]) {
                start = medium + 1;
            } else {
                end = medium - 1;
            }
            medium  = (start + end) / 2;
        }
        System.out.println("found number " + num + " index: " + medium);
    }

}
