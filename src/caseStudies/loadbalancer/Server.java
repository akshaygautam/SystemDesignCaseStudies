package caseStudies.loadbalancer;

public class Server {
    private String name;
    private int weight;
    private int currentLoad;

    public Server(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.currentLoad = 0;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void incrementLoad() {
        currentLoad++;
    }

    public void resetLoad() {
        currentLoad = 0;
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentLoad=" + currentLoad +
                '}';
    }
}
