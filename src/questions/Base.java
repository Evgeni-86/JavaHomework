package questions;

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

class Derived extends Base {

    private final int j = 3;

    @Override
    public void setI() {
        i = j;
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
    }

}