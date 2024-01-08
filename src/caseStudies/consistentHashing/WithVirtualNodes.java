package caseStudies.consistentHashing;

import java.util.*;

public class WithVirtualNodes {

    private final SortedMap<Integer, String> ring = new TreeMap<>();
    private final Map<String, List<Integer>> virtualNodes = new HashMap<>();
    private static final int NUM_VIRTUAL_NODES = 3;

    // Add a node to the ring with virtual nodes
    public void addNode(String node) {
        for (int i = 0; i < NUM_VIRTUAL_NODES; i++) {
            String virtualNode = node + "-Virtual-" + i;
            int hash = getHash(virtualNode);
            ring.put(hash, virtualNode);

            // Keep track of virtual nodes for each physical node
            virtualNodes.computeIfAbsent(node, k -> new ArrayList<>()).add(hash);
        }
    }

    // Remove a node and its virtual nodes from the ring
    public void removeNode(String node) {
        List<Integer> virtualNodeHashes = virtualNodes.get(node);
        if (virtualNodeHashes != null) {
            for (int hash : virtualNodeHashes) {
                ring.remove(hash);
            }
        }
        virtualNodes.remove(node);
        System.out.println("Removed.. : " + node);
    }

    // Get the node responsible for a given key
    public String getNodeForKey(String key) {
        if (ring.isEmpty()) {
            return null;
        }

        int hash = getHash(key);
        // Find the entry with a hash value equal to or just greater than the key's hash
        SortedMap<Integer, String> tailMap = ring.tailMap(hash);
        int nodeHash = tailMap.isEmpty() ? ring.firstKey() : tailMap.firstKey();

        // Get the physical node from the virtual nodes mapping
        for (Map.Entry<String, List<Integer>> entry : virtualNodes.entrySet()) {
            if (entry.getValue().contains(nodeHash)) {
                return entry.getKey();
            }
        }

        return null;
    }

    private int getHash(String value) {
        int hash = 17;

        for (int i = 0; i < value.length(); i++) {
            hash = 31 * hash + value.charAt(i);
        }

        return hash;
    }

    public static void main(String[] args) {
        WithVirtualNodes consistentHashing = new WithVirtualNodes();

        // Add nodes to the ring with virtual nodes
        consistentHashing.addNode("A");
        consistentHashing.addNode("B");
        consistentHashing.addNode("C");
        consistentHashing.addNode("D");

        // Get node responsible for a key
        test(consistentHashing);
        consistentHashing.removeNode("C");
        test(consistentHashing);
    }

    private static void test(WithVirtualNodes consistentHashing) {
        Set<String> keys = Set.of("Apple", "Banana", "Facebook", "Water", "Harry potter");
        for (String key : keys) {
            String responsibleNode = consistentHashing.getNodeForKey(key);
            System.out.println("Node responsible for key '" + key + "': " + responsibleNode);
        }
    }
}

