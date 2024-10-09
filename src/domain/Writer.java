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
            //System.out.println("Writing new content: " + content);
            resourceService.writeData(content);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
