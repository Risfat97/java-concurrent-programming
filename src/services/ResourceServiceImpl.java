package services;

import java.util.Deque;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ResourceServiceImpl implements ResourceService {
    private Deque<String> resources = new ConcurrentLinkedDeque<>();

    public void writeData(String data) {
        resources.add(data);
    }

    public Optional<String> readData() {
        return Optional.ofNullable(resources.poll());
    }
}
