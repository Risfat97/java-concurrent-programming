package services;

import java.util.Optional;

public interface ResourceService {
    void writeData(String data);
    Optional<String> readData();
}
