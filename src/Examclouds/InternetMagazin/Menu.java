package Examclouds.InternetMagazin;

import java.util.Random;
import java.util.Scanner;

public class Menu {

    static EnumMenu menu = EnumMenu.LOGIN;
    static EnumMenu catalog = EnumMenu.CATALOG;
    static EnumMenu basket = EnumMenu.BASKET;
    static EnumMenu out = EnumMenu.OUT;
    static EnumMenu book = EnumMenu.BOOK;
    static EnumMenu tool = EnumMenu.TOOL;
    static EnumMenu toy = EnumMenu.TOY;
    static EnumMenu back = EnumMenu.BACK;
    static EnumMenu pay = EnumMenu.PAY;


    private Menu() {
    }

    static public User logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("------------Вход--------------");
        System.out.println("--Введите имя--");
        String name = scanner.nextLine();
        System.out.println("--Введите пароль--");
        String pass = scanner.nextLine();
        User user = new User(name, pass, (int) (Math.random() * 100));
        Basket basket = new Basket();
        user.setUserBasket(basket);
        return user;
    }

    static public EnumMenu showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("------------Меню--------------");
        System.out.println("1 - " + menu.getDescription());//enum
        System.out.println("2 - " + catalog.getDescription());
        System.out.println("3 - " + basket.getDescription());
        System.out.println("4 - " + out.getDescription());

        int input = scanner.nextInt();

        if (input == 1) {
            return menu;
        }
        if (input == 2) {
            return catalog;
        }
        if (input == 3) {
            return basket;
        }
        return out;
    }

    static public EnumMenu showCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("------------Каталоги--------------");
        System.out.println("1 - " + book.getDescription());//enum
        System.out.println("2 - " + tool.getDescription());
        System.out.println("3 - " + toy.getDescription());
        System.out.println("4 - " + back.getDescription());

        int input = scanner.nextInt();

        if (input == 1) {
            return book;
        }
        if (input == 2) {
            return tool;
        }
        if (input == 3) {
            return toy;
        }
        return back;
    }

    static public EnumMenu showPay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("1 - " + pay.getDescription());//enum
        System.out.println("4 - " + back.getDescription());

        int input = scanner.nextInt();

        if (input == 1) {
            return pay;
        }

        return back;
    }

    static public int inputNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-Добавить в корзину--");
        System.out.println("0 - " + back.getDescription());
        return scanner.nextInt();
    }

}
