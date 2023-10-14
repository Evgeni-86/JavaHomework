package algoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainWork {

    public static void main(String[] args) {

        List<Integer> train = new ArrayList<>(Arrays.asList(32, 54, 21, 12, 4, 0, 23));
//        List<Integer> train = new ArrayList<>();
        int quantitySeats = 75;

        System.out.println(train);
        System.out.println(quantitySeats);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("End")) {

            int quantityPassenger = Integer.parseInt(input.replaceAll("[^0-9]", ""));

            if (Character.isLetter(input.charAt(0)) && quantityPassenger <= quantitySeats) {
                train.add(quantityPassenger);

            } else if (Character.isDigit(input.charAt(0))) {

                for (int i = 0; i < train.size(); i++) {
                    int freeSeats = quantitySeats - train.get(i);
                    if (freeSeats >= quantityPassenger) {
                        train.set(i, train.get(i) + quantityPassenger);
                        quantityPassenger -= freeSeats;
                        break;
                    }
                }

                if (quantityPassenger > 0) {
                    System.out.println("нехватило мест : " + quantityPassenger + " пассажирам в одном вагоне, пытаемся рассадить по всем вагонам");

                    for (int i = 0; train.size() > i && quantityPassenger > 0; i++) {
                        int freeSeats = quantitySeats - train.get(i);
                        train.set(i, quantitySeats);
                        quantityPassenger -= freeSeats;
                    }

                    if (quantityPassenger > 0) {
                        System.out.println("нехватило мест : " + quantityPassenger + " пассажирам, создайте вагон");
                    }
                }
            }

            System.out.println(train);
            input = scanner.nextLine();
        }
    }

}
