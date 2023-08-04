package Lessons.lesson10;

public class Main {
    public static void main(String[] args) {
        String str = "ПРИВЕТ";
        System.out.println(test(str));
    }

    static String test(String inputStr) {
        char[] arr_ru = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
                'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        String[] morze = {".-", "-...", ".--", "--.", "-..", ".", "...-",
                "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                ".-.", "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----",
                "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};

        StringBuilder sb = new StringBuilder(); //запись результата
        String arrString = String.copyValueOf(arr_ru);
        inputStr = inputStr.toLowerCase();

        for (int i = 0; i < inputStr.length(); i++) { //for - O(n)
            char curCh = inputStr.charAt(i);
            int indexMorze = arrString.indexOf(curCh); //indexOf - O(n)
            sb.append(morze[indexMorze]).append(" ");
        }

        return sb.toString();
    }

}
