package caseStudies.loadbalancer;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
    private LoadBalancingStrategy strategy;

    public LoadBalancer(LoadBalancingStrategy strategy) {
        this.strategy = strategy;
    }

    public String request() {
        // Simulating a request
        return "Request sent to server: " + strategy.getNextServer();
    }
    public static void main(String[] args) {
        Server server1 = new Server("Server1", 3);
        Server server2 = new Server("Server2", 2);
        Server server3 = new Server("Server3", 1);

        List<Server> servers = new ArrayList<>();
        servers.add(server1);
        servers.add(server2);
        servers.add(server3);

        // Configure load balancing strategy (Round Robin in this case)

        System.out.println("======================== Round Robbin ==========================");
        roundRobin(servers);
        System.out.println("==================== Weighted Round Robbin =====================");
        weightedRoundRobin(servers);
    }

    private static void weightedRoundRobin(List<Server> servers) {
        // Initialize the weighted round-robin load balancer
        WeightedRoundRobinLoadBalancer loadBalancer = new WeightedRoundRobinLoadBalancer(servers);

        // Simulate requests and server activity
        for (int i = 0; i < 500; i++) {
            Server selectedServer = loadBalancer.getNextServer();
            System.out.println("Request sent to server: " + selectedServer.getName());
            // Simulate server processing time
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display the final load on each server
        servers.forEach(server ->
                System.out.println("Final load on " + server.getName() + ": " + server.getCurrentLoad()));
    }

    private static void roundRobin(List<Server> servers) {
        LoadBalancingStrategy strategy = new RoundRobinStrategy(servers);

        // Initialize the load balancer with the chosen strategy
        LoadBalancer roundRobbin = new LoadBalancer(strategy);

        // Simulate multiple requests
        for (int i = 0; i < 10; i++) {
            String response = roundRobbin.request();
            System.out.println(response);
        }
    }
}
