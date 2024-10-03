import java.util.ArrayList;
import java.util.List;

import domain.Reader;
import domain.Writer;

public class App {
    private static List<String> contents = new ArrayList<>();

    public static void main(String[] args) {
        Writer w = new Writer(contents);
        Reader r = new Reader(contents);

        Thread th1 = new Thread(w);
        Thread th2 = new Thread(r);
        
        System.out.println("Launching threads");
        th1.start();
        th2.start();
    }
}
