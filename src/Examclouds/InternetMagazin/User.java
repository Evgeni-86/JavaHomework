package Examclouds.InternetMagazin;

import java.util.Arrays;

public class User {
    private int id;
    private char[] login;
    private char[] password;
    private Basket userBasket;

    public User(String log, String pass, int id) {
        char[] arrLogin = new char[log.length()];
        char[] arrPass = new char[pass.length()];
        log.getChars(0, log.length(), arrLogin, 0);
        pass.getChars(0, pass.length(), arrPass, 0);
        this.login = arrLogin;
        this.password = arrPass;
        this.id = id;
        //Массив же остается в памяти, не факт что GC его удалит??
        arrLogin = null;
        arrPass = null;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }

    public String getLogin() {
        return String.copyValueOf(login);
    }

    public void delete(){
        this.login = null;
        this.password = null;
    }

    @Override
    public String toString() {
        return "User{" +
                "login=" + Arrays.toString(login) +
                '}';
    }
}
