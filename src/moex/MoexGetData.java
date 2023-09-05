package moex;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class MoexGetData {

    private MoexGetData() {
    }

    public static boolean Run(String urlAddress, String date, String pref, String id, String postf) {
        String url = urlAddress + date + pref + id + postf;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Result.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                String dateStringInFile = s.split(" ")[0];
                if (dateStringInFile.equalsIgnoreCase(date)) {
                    System.out.println("Такие данные уже есть");
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка чтения файла");
            return false;
        }
        //---------------------------------
        StringBuilder response = requestData(url);
        if (response != null) {
            String filterResponse = filterData(response);
            if (filterResponse != null) {
                return writeToFile(date, filterResponse);
            }
        }
        return false;
        //---------------------------------
    }


    private static StringBuilder requestData(String url) {
        StringBuilder response = new StringBuilder();
        HttpURLConnection connection;

        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"))) {

                    String inputLine;
                    while ((inputLine = bufferedReader.readLine()) != null) {
                        bufferedWriter.write(inputLine.trim());
                        response.append(inputLine);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка запроса");
            return null;
        }

        return response;
    }

    private static String filterData(StringBuilder response) {
        if (response.length() > 0) {
            StringBuilder filterResponse = new StringBuilder();
            boolean currentDigits = false;
            for (int i = 0; i < response.length(); i++) {

                if (Character.isLetter(response.charAt(i))) {
                    if (filterResponse.length() > 0 && currentDigits) {
                        filterResponse.append(";");
                    }
                    filterResponse.append(response.charAt(i));
                    currentDigits = false;
                }

                if (Character.isDigit(response.charAt(i))) {
                    if (filterResponse.length() > 0 && !currentDigits) {
                        filterResponse.append("=");
                    }
                    filterResponse.append(response.charAt(i));
                    currentDigits = true;
                }

            }
            System.out.println(filterResponse);
            return filterResponse.toString();

        }
        System.out.println("Нет данных для обработки");
        return null;
    }

    private static boolean writeToFile(String currentDate, String data) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Result.txt", true))) {

            bufferedWriter.write(currentDate + " " + data);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка записи в файл");
            return false;
        }
        System.out.println("Новые данные записаны");
        return true;
    }



}
