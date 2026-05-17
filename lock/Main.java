package lock;

public class Main {
    public static void main(String[] args) {
        Bank hbl = new Bank();

        Runnable run = new Runnable() {
            public void run() {
                hbl.withDraw(50);
            }
        };

        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }
}
