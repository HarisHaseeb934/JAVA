public class Lambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        });

        t1.start();
    }
}
