package domain;

import java.util.List;

public class Writer extends Thread {
    private final String[] contents = {"Java", "Spring Boot", "Quarkus", "Maven"};
    private List<String> resources;

    public Writer(List resources) {
        this.resources = resources;
    }

    public void run() {
        for(String content: contents) {
            System.out.println("Writing new content: " + content);
            resources.add(content);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
