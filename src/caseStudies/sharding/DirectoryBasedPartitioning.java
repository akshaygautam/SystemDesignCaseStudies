package caseStudies.sharding;

import java.util.HashMap;
import java.util.Map;

class DirectoryBasedPartitioning {
    private Map<String, String> directory;

    public DirectoryBasedPartitioning() {
        directory = new HashMap<>();
    }

    public void addMapping(String key, String partition) {
        directory.put(key, partition);
    }

    public String getPartitionForKey(String key) {
        return directory.getOrDefault(key, "DefaultPartition");
    }

    public static void main(String[] args) {
        DirectoryBasedPartitioning directoryPartitioning = new DirectoryBasedPartitioning();

        // Add mappings to the directory
        directoryPartitioning.addMapping("Key1", "Partition1");
        directoryPartitioning.addMapping("Key2", "Partition2");
        directoryPartitioning.addMapping("Key3", "Partition1");

        // Retrieve partitions for keys
        String partitionForKey1 = directoryPartitioning.getPartitionForKey("Key1");
        String partitionForKey2 = directoryPartitioning.getPartitionForKey("Key2");
        String partitionForKey3 = directoryPartitioning.getPartitionForKey("Key3");

        // Display results
        System.out.println("Partition for Key1: " + partitionForKey1);
        System.out.println("Partition for Key2: " + partitionForKey2);
        System.out.println("Partition for Key3: " + partitionForKey3);
    }
}
