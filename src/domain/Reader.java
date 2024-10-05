package domain;

import java.util.Optional;

import services.ResourceService;

public class Reader implements Runnable {
    private ResourceService resourceService;

    public Reader(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @Override
    public void run() {
        int i = 0;

        while(i++ < 3) {
            synchronized (resourceService) {
                System.out.println("Reading data...");
                Optional<String> data = resourceService.getData();
                if (data.isPresent()) {
                    System.out.println(data.get());
                }
            }
        }
    }
}
