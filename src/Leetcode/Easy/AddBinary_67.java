//67. Add Binary
/*
Input: a = "1010", b = "1011"
Output: "10101"
*/

public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int memory = 0;

        int indexOneString = a.length() - 1;
        int indexTwoString = b.length() - 1;

        while(indexOneString >= 0 || indexTwoString >= 0) {

            int firstNumber = 0;
            int secondNumber = 0;

            if (indexOneString >= 0) {
                firstNumber = Integer.parseInt(String.valueOf(a.charAt(indexOneString--)));
            }
            if (indexTwoString >= 0) {
                secondNumber = Integer.parseInt(String.valueOf(b.charAt(indexTwoString--)));;
            }

            int sum = memory + firstNumber + secondNumber;

            // if (memory == 0) {
            //     if (sum == 2) {
            //         sb.append(0);
            //         memory = 1;
            //     } else {
            //         sb.append(sum);
            //     }
            // } else if (memory == 1) {
            //     if (sum == 2) {
            //         sb.append(1);
            //     } else if (sum == 1) {
            //         sb.append(0);
            //     } else if (sum == 0) {
            //         sb.append(1);
            //         memory = 0;
            //     }
            // }

            if (sum >= 2) {
                sb.append(sum - 2);
                memory = 1;
            } else {
                sb.append(sum);
                memory = 0;
            }
            
        }

        if (memory > 0) {
            sb.append(memory);
        }
        sb.reverse();

        return sb.toString();
    }
}