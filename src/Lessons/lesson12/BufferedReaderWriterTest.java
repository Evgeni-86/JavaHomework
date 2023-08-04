package Lessons.lesson12;

import java.io.*;

public class BufferedReaderWriterTest {
    public static void main(String[] args) {
        String s1 = "Hello World!";

        try(BufferedReader bReader = new BufferedReader(
                new FileReader("C:\\Users\\evgeni\\Desktop\\FileTest.txt"));
            BufferedWriter bWriter = new BufferedWriter(
                    new FileWriter("NewTest.txt"))
        )
        {
//            int ch;
//            while ((ch = bReader.read()) != -1){
//                bWriter.write((char) ch);
//            }

            String s;
            while ((s = bReader.readLine()) != null){
                bWriter.write(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
