package domain;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() { return count.intValue(); }
}
