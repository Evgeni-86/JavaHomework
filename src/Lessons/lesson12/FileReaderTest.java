package Lessons.lesson12;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {//может появится исключение
        FileReader fileReader = null;//инициализировали переменную

        try {
            fileReader = new FileReader("C:\\Users\\evgeni\\Desktop\\FileTest.txt");

            int ch;
            while ((ch = fileReader.read()) != -1) {
                //read  - возвращает int (нужен кастинг)
                System.out.print((char) ch);
            }
            System.out.println();
            System.out.println("Чтение выполнено");


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

        finally {
            fileReader.close();//ошибка закрытия потока (обрабатывается метод main)
        }
    }
}
