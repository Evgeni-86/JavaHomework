//58. Length of Last Word

public class LengthOfLastWord_58 {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }


    public static String lengthOfLastWord(String s) {
        s = s.trim();
        int last = s.lastIndexOf(" ");
        return s.substring(last + 1, s.length());
    }

}