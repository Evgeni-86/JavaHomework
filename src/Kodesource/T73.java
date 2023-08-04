//Напишите программу на Java для создания новой строки,
// содержащей первые и последние символы из двух заданных
// строк. Если длина одной из строк равна 0,
// используйте «#» для пропущенного символа.

package Kodesource;

public class T73 {
    public static void main(String[] args) {
        String str1 = "Asklfdkfl";
        String str2 = "Huiouwior";
        String str3 = "";
        String[] strArr = {"Asklfdkfl", "Huiouwior"};
        System.out.println(getString(str1, str3));
    }

    static String getString(String str1, String str2) {//String... args

        char[] chArr = new char[2];

        if (str1.length() > 0) {
            chArr[0] = str1.charAt(0);
        } else {
            chArr[0] = '#';
        }

        if (str2.length() > 0) {
            chArr[1] = str2.charAt(str2.length() - 1);
        } else {
            chArr[1] = '#';
        }
        return String.copyValueOf(chArr);


//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < args.length; i++) {
//            if (args[i].length() > 0) {
//                char chFirst = args[i].charAt(0);
//                char chLast = args[i].charAt(args[i].length() - 1);
//                sb.append(chFirst);
//                sb.append(chLast);
//            } else {
//                sb.append("#");
//            }
//        }
//        return sb.toString();

    }
}
