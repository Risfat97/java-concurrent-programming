package services;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;

public class ResourceServiceImpl implements ResourceService {
    private Deque<String> resources = new ArrayDeque<>();

    public void addData(String data) {
        resources.add(data);
    }

    public Optional<String> getData() {
        return resources.isEmpty() ? Optional.empty() : Optional.of(resources.removeFirst());
    }
}
