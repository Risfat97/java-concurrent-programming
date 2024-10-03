import java.util.ArrayList;
import java.util.List;

import domain.Reader;
import domain.Writer;

public class App {
    private static List<String> contents = new ArrayList<>();

    public static void main(String[] args) {
        Writer w = new Writer(contents);
        Reader r = new Reader(contents);
        
        System.out.println("Launching threads");
        w.start();
        r.start();
    }
}
