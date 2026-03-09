public class Demo {
    static int x = 0; //Либо AtomicInteger

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (Demo.class) {
                    x++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                synchronized (Demo.class) {
                    x++;
                }
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(x);
    }
}