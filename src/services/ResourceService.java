package services;

import java.util.Optional;

public interface ResourceService {
    void addData(String data);
    Optional<String> getData();
}
