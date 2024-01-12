package caseStudies.loadbalancer;

import java.util.List;

public class RoundRobinStrategy implements LoadBalancingStrategy {
    private final List<Server> servers;
    private int currentIndex;

    public RoundRobinStrategy(List<Server> servers) {
        this.servers = servers;
        this.currentIndex = 0;
    }

    @Override
    public Server getNextServer() {
        Server server = servers.get(currentIndex);
        currentIndex = (currentIndex + 1) % servers.size();
        return server;
    }
}

