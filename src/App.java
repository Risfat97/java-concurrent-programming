import domain.Counter;

public class App {
    private final static int NB_THREAD = 10;

    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable counterR = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    counter.increment();
            }
        };

        Thread[] threads = new Thread[NB_THREAD];

        for (int i = 0; i < NB_THREAD; i++) {
            threads[i] = new Thread(counterR);
        }

        System.out.println("Launching threads");
        for (int i = 0; i < NB_THREAD; i++) {
            threads[i].start();
        }

        for (int i = 0; i < NB_THREAD; i++) {
            try {
                threads[i].join();
            } catch(InterruptedException e) {
                //...
            }
        }

        System.out.println("Final value of counter: " + counter.getCount());
    }
}
