package caseStudies.loadbalancer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WeightedRoundRobinLoadBalancer implements LoadBalancingStrategy{
    private final List<Server> servers;
    private final int totalWeight;
    private int currentIndex;

    public WeightedRoundRobinLoadBalancer(List<Server> servers) {
        this.servers = servers;
        this.totalWeight = calculateTotalWeight(servers);
        this.currentIndex = 0;
    }

    private int calculateTotalWeight(List<Server> servers) {
        return servers.stream().mapToInt(Server::getWeight).sum();
    }

    public Server getNextServer() {
        int index = getNextServerIndex();
        return servers.get(index);
    }

    private int getNextServerIndex() {
        int index = currentIndex;

        while (true) {
            index = (index + 1) % servers.size();
            if (index == currentIndex) {
                // All servers have been considered; reset loads and try again
                servers.forEach(Server::resetLoad);
            }

            // Choose a server with a probability based on its weight
            int randomNum = ThreadLocalRandom.current().nextInt(totalWeight);
            if (randomNum < servers.get(index).getWeight()) {
                currentIndex = index;
                servers.get(index).incrementLoad();
                return index;
            }
        }
    }
}
