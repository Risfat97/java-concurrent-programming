package domain;

import java.util.List;

public class Reader implements Runnable {
    private List<String> data;

    public Reader(List<String> data) {
        this.data = data;
    }

    @Override
    public void run() {
        int i = 0;

        while(i++ < 7) {
            System.out.println("Reading all data...");
            System.out.println(data);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
