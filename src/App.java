import domain.Reader;
import domain.Writer;
import services.ResourceService;
import services.ResourceServiceImpl;

public class App {
    private static ResourceService resourceService;
    private final static int NB_THREAD = 5;

    public static void main(String[] args) {
        resourceService = new ResourceServiceImpl();
        Writer writer = new Writer(resourceService);
        Reader reader = new Reader(resourceService);

        Thread[] threads = new Thread[NB_THREAD];

        threads[0] = new Thread(writer);
        for (int i = 1; i < NB_THREAD; i++) {
            threads[i] = new Thread(reader);
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
    }
}
