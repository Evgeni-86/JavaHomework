package Lessons.lesson12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        String s1 = "Hello World!";
        String s2 = "Hello World!";

/////////////// FILE WRITER ////////////////////////////////////////////////////////////////
        File file = new File("C:\\Users\\evgeni\\Desktop\\FileTest.txt");//получение файла или создание
        FileWriter fileWriter = null;//нужно проинициализировать чтобы finally видел переменную

        try { //если файл не запишется
            fileWriter = new FileWriter(file); // (file, true) - присоединить к тому что уже есть

            //читает строку и записывает
//            for (int i = 0; i < s.length(); i++){
//                fileWriter.write(s.charAt(i));
//            }

            fileWriter.write(s1);//все ровно идет посимвольная работа
            fileWriter.append(s2);

            System.out.println("Запись выполнена");

        } catch (IOException e) { //тогда выведем
            System.out.println("Не удалось записать файл");
            e.printStackTrace();
        }
        finally {
            //добавляем обработку исключения если ошибка при закрытии потока
            fileWriter.close(); //нужно закрыть стрим (закрыть файл), (закрыть == сохранить??)
        }

        ///TRY WITH RESOURCES
//        File file = new File("C:\\Users\\evgeni\\Desktop\\FileTest.txt");//получение файла или создание
//
//        try(FileWriter fileWriter = new FileWriter(file)) { //если файл не запишется
//            //читает строку и записывает
////            for (int i = 0; i < s.length(); i++){
////                fileWriter.write(s.charAt(i));
////            }
//
//            fileWriter.write(s1);//все ровно идет посимвольная работа
//            fileWriter.append(s2);
//
//            System.out.println("Запись выполнена");
//        }
///////////////////////////////////////////////////////////////////////////////////////////////

///////////////// BUFFERED WRITER /////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////
    }
}
