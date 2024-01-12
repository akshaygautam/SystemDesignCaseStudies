package caseStudies.loadbalancer;

public interface LoadBalancingStrategy {
    Server getNextServer();
}
