package mult;

public class Volatile3 extends Thread{
    public Marker flag;

    @Override
    public void run() {
        while (flag.flag) {

        }
        System.out.println("Exit");
    }
}

class Marker {
    volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        Marker marker = new Marker();
        Volatile3 volatile3 = new Volatile3();
        volatile3.flag = marker;
        volatile3.start();
        Thread.sleep(2000);
        marker.flag = false;
    }
}
