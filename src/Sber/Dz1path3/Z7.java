package Sber.Dz1path3;
//ПОДСЧЕТ БЕЗ ПРОБЕЛОВ
public class Z7 {
    public static void main(String[] args) {
        String inString = new String("Never give up");
        System.out.println(inString);
        int counter = 0;
        for (int i = 0; i < inString.length(); i++) {
            if (inString.substring(i, i + 1).equalsIgnoreCase(" ")) {
                counter++;
            }
        }
        System.out.println(inString.length() - counter + " символов");
    }
}
