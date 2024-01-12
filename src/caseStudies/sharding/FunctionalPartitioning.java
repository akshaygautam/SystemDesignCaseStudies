package caseStudies.sharding;

import java.util.HashMap;
import java.util.Map;

class FunctionalPartitioning {
    private Map<String, String> partitions;

    public FunctionalPartitioning() {
        partitions = new HashMap<>();
    }

    public void addPartition(String partition) {
        partitions.put(partition, partition);
    }

    public String getPartitionForKey(String key) {
        // Simple hash function to determine the partition based on the key
        int hash = key.hashCode();
        int partitionIndex = Math.abs(hash) % partitions.size();
        return partitions.getOrDefault(partitionIndex, "DefaultPartition");
    }

    public static void main(String[] args) {
        FunctionalPartitioning functionalPartitioning = new FunctionalPartitioning();

        // Add partitions
        functionalPartitioning.addPartition("Partition1");
        functionalPartitioning.addPartition("Partition2");
        functionalPartitioning.addPartition("Partition3");

        // Retrieve partitions for keys
        String partitionForKey1 = functionalPartitioning.getPartitionForKey("Key1");
        String partitionForKey2 = functionalPartitioning.getPartitionForKey("Key2");
        String partitionForKey3 = functionalPartitioning.getPartitionForKey("Key3");

        // Display results
        System.out.println("Partition for Key1: " + partitionForKey1);
        System.out.println("Partition for Key2: " + partitionForKey2);
        System.out.println("Partition for Key3: " + partitionForKey3);
    }
}

