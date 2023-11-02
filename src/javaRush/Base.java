package javaRush;

import Examclouds.TransportCar.Professions.Driver;

public class Base {
    protected int i = 1;
    public Base() {
        setI();
    }
    public void setI() {
        i = 2;
    }
    public int getI() {
        return i;
    }
}

class Derived extends Base{
    private int j = 3; //т.е. компилятор знает что будет переменная j будет но она не инициализирована

    @Override
    public void setI() {
        i = j;
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        System.out.println(derived.getI());
    }
}