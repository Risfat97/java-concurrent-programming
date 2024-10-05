package domain;

import services.ResourceService;

public class Writer implements Runnable {
    private final String[] contents = {"Java", "Spring Boot", "Quarkus", "Maven", "Gradle", "Jakarta EE"};
    private ResourceService resourceService;

    public Writer(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @Override
    public void run() {
        for(String content: contents) {
            synchronized (resourceService) {
                System.out.println("Writing new content: " + content);
                resourceService.addData(content);
            }
        }
    }
}
