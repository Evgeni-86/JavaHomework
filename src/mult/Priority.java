package mult;

public class Priority {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.getPriority());
    }
}
