package ioAndNio;


import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--FileReader FileWriter----------
//        File file = new File("test.txt");
//        File fileOut = new File("testOut.txt");
//
//        try (FileReader fileReader = new FileReader(file);
//             FileWriter fileWriter = new FileWriter(fileOut,true)
//        ) {
//
//            while (fileReader.ready()) {
//                fileWriter.write(fileReader.read());
//            }
//
//            int a;
//            while ((a = fileReader.read()) != -1) {
//                fileWriter.write((char) a);
//            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        //----------------------------------

        //--BufferedReader BufferedWriter---
//        File file = new File("test.txt");
//        File fileOut = new File("testOut.txt");
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut, true))
//        ) {
//
//            char[] buffer = new char[10];
//            while (bufferedReader.ready()) {
//                int a = bufferedReader.read(buffer);
//                bufferedWriter.write(buffer, 0, a);
//            }
//
////            while (bufferedReader.ready()) {
////                bufferedWriter.write(bufferedReader.readLine());
////            }
//
////           char[] buffer = new char[10];
////           int a;
////
////           while ((a = bufferedReader.read(buffer)) > 0){
////               bufferedWriter.write(buffer, 0 , a);
////           }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        //----------------------------------

        //--InputStreamReader OutputStreamWriter (ЕСТЬ ЛИ СМЫСЛ СИМВОЛЫ -> БАЙТЫ -> СИМВОЛЫ ???)--
//        File file = new File("test.txt");
//        File fileOut = new File("testOut.txt");
//
//        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(fileOut.toPath()))
//        ){
//
//           while (inputStreamReader.ready()){
//                outputStreamWriter.write(inputStreamReader.read());
//           }
//
//        } catch (IOException ex){
//            ex.printStackTrace();
//        }
        //-----------------------------------------

        //--FileInputStream FileOutputStream (НЕПРАВИЛЬНО ЧИТАТЬ ТЕКСТОВЫЕ ФАЙЛЫ ПОБАЙТОВО)-----------
//        File file = new File("test.txt");
//        File fileOut = new File("testOut.txt");
//
//        try (FileInputStream fileInputStream = new FileInputStream(file);
//             FileOutputStream fileOutputStream = new FileOutputStream(fileOut);
//        ) {
//
////            while (fileInputStream.available() > 0){
////                fileOutputStream.write(fileInputStream.read());
////            }
//
//            int a;
//            while ((a = fileInputStream.read()) != -1){
//                fileOutputStream.write(a);
//            }
//
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        //-----------------------------------------

        //--BufferedInputStream BufferedOutputStream--
//        File file = new File("test.txt");
//        File fileOut = new File("testOut.txt");
//
//        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
//             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileOut))
//        ) {
//
////            while (bufferedInputStream.available() > 0) {
////                bufferedOutputStream.write(bufferedInputStream.readAllBytes());
////            }
//
//            byte[] buffer = new byte[10];
//            int a;
//            while ((a = bufferedInputStream.read(buffer)) != -1) {
//                System.out.println(a);
//                bufferedOutputStream.write(buffer, 0, a);
//            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        //-----------------------------------------

        //--КАНАЛ--------------------------------
//        Path path = Paths.get("test.txt");
//        Path pathOut = Paths.get("testOut.txt");
//
////        try {
////            FileChannel fi = (FileChannel) Channels.newChannel(new FileInputStream(path.toFile()));
////        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
////        }
//
//        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);
//             FileChannel fileChannelOut = FileChannel.open(pathOut, StandardOpenOption.WRITE)) {
//
//            ByteBuffer byteBuffer = ByteBuffer.allocate(5);
//
//            while (fileChannel.read(byteBuffer) > 0) {
//                byteBuffer.flip();
//                fileChannelOut.write(byteBuffer);
//                byteBuffer.clear();
//            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        //

        //--Scanner---------------------------------
//        Path path = Paths.get("test.txt");
//        try {
//            Scanner scanner = new Scanner(path);
//            while (scanner.hasNext()){
//                System.out.println(scanner.next());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        //-----------------------------------------

//        Path path = Paths.get("src/new");
//        Path path2 = Paths.get("test2.txt");
//        if (!Files.exists(path)){
//            try {
//                Files.createDirectories(path);
//                Files.createFile(path.resolve(path2));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }


        //--Serialisation--------------------------

//        TestSerial testSerial = new TestSerial();
//        TestSerial2 testSerial2 = new TestSerial2();
//
//        Path path = Paths.get("serializableTest");
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
//
//            objectOutputStream.writeObject(testSerial);
//            objectOutputStream.writeObject(testSerial2);
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        try (FileInputStream fileInputStream = new FileInputStream(path.toFile());
//             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
//
//            TestSerial obj1 = (TestSerial) objectInputStream.readObject();
//            TestSerial2 obj2 = (TestSerial2) objectInputStream.readObject();
//
//            System.out.println(obj1.name);
//            System.out.println(obj1.testSerialNotSerial);
//            System.out.println(obj2.name);
//            System.out.println(obj2.number);
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //-----------------------------------------
    }
}


class TestSerial implements Serializable {

    String name = "TestSerialName";
    int id = 45;
    int number = 12;
    transient TestSerialNotSerial testSerialNotSerial = new TestSerialNotSerial();

}

class TestSerial2 implements Serializable {

    String name = "TestSerial2Name";
    int id = 20;
    transient int number = 10;

}

class TestSerialNotSerial {
    String name = "TestSerialNotSerialName";
}
