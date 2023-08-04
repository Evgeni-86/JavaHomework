package Examclouds.InternetMagazin;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Magazine {
    public static void main(String[] args) {

        User user = null;//по умолчанию

        EnumMenu menu = Menu.showMenu();
        while (menu != EnumMenu.OUT) {

            switch (menu) {
                case LOGIN: {
                    if (user == null) {
                        user = Menu.logIn();
                    } else {
                        System.out.println("-Вы уже вошли-");
                    }
                    break;
                }
                //---------------------------------------------------------
                case CATALOG: {
                    if (user == null) {
                        System.out.println("-Авторизируйтесь!-");
                        break;
                    }

                    EnumMenu category = Menu.showCategory();
                    while (category != EnumMenu.BACK) {

                        switch (category) {
                            case BOOK: {
                                printCatalog(ProductBase.getCategoryBooks());
                                int product = Menu.inputNum();
                                if (product == 0) {
                                    break;
                                }
                                user.getUserBasket().addProducts(product, ProductBase.getCategoryBooks());
                                continue;
                            }
                            case TOOL: {
                                printCatalog(ProductBase.getCategoryTools());
                                int product = Menu.inputNum();
                                if (product == 0) {
                                    break;
                                }
                                user.getUserBasket().addProducts(product, ProductBase.getCategoryTools());
                                continue;
                            }
                            case TOY: {
                                printCatalog(ProductBase.getCategoryToys());
                                int product = Menu.inputNum();
                                if (product == 0) {
                                    break;
                                }
                                user.getUserBasket().addProducts(product, ProductBase.getCategoryToys());
                                continue;
                            }
                        }
                        category = Menu.showCategory();
                    }

                }
                break;
                //----------------------------------------------------------
                case BASKET: {
                    if (user == null) {
                        System.out.println("-Авторизируйтесь!-");
                        break;
                    }
                    printBasketUser(user);
                    EnumMenu pay = Menu.showPay();
                    if (pay == EnumMenu.PAY) {
                        System.out.println("-Оплачено-");
                        printBasketUser(user);
                        writeBasketToFile(user);
                        break;
                    }
                }
                break;
                //----------------------------------------------------------
            }

            menu = Menu.showMenu();
        }

        if (user != null) {
            user.delete();
            user = null;
        }

    }

    ////////////////////////////////////////////////////////////////////////////////////////
    static void printCatalog(Category category) {
        String formatHead = "|%36s|%n";
        String format = "%s | %10s | %10s | %10s|";
        int i = 1;
        System.out.printf(formatHead, "Категория");

        for (Product elem : category.getCatalog()) {
            System.out.printf(format, i++, elem.getName(), elem.getPrise(), elem.getRating());
            System.out.println();
        }
    }

    static void printBasketUser(User user) {
        String formatHead = "|%-36s|%n";
        String format = "|%10s | %10s | %10s|";
        System.out.printf(formatHead, "ПОКУПКИ ПОСЕТИТЕЛЕЙ");
        System.out.printf(formatHead, user.getLogin());

        for (Product elem : user.getUserBasket().getBasket()) {
            System.out.printf(format, elem.getName(), elem.getPrise(), elem.getRating());
            System.out.println();
        }
    }

    static void writeBasketToFile(User user) {
        String formatHead = "|%-36s|%n";
        String format = "|%10s | %10s | %10s|\n";

        LinkedList<Product> basket = user.getUserBasket().getBasket();
        File file = new File("basket_" + user + ".txt");

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(file));) {

            printWriter.printf(formatHead, user);
            for (Product product : basket) {
                printWriter.printf(format, product.getName(), product.getPrise(), product.getRating());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
