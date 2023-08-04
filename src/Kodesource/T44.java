package Kodesource;
//ЗНАЧЕНИЕ n + nn + nnn
public class T44 {
    public static void main(String[] args) {
        int number = 5;
        StringBuilder sb = new StringBuilder("");
        StringBuilder sbRezult = new StringBuilder("");
        int rez = 0;

        for (int i = 0; i < 3; i++) {
            sb.setLength(0);
            for (int j = 0; j <= i; j++) {
                sb.append(number);
            }
            rez = rez + Integer.parseInt(sb.toString());
            sbRezult.append(sb.toString() + " ");
        }
        System.out.println(sbRezult);
        System.out.println(rez);
    }
}
