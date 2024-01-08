# Consistent Hashing

- This technique is used in distributed systems for assigning key to nodes in a way that minimizes the reorganization of keys when nodes are added or removed.
- It is particularly useful when the number of nodes in a system may change dynamically. eg: distributed caching, distributed database, and load balancing.

## How it works and components.

1. **Hash Function**
   - Consistent hashing uses a hash function to map both keys and nodes to a common hash space, typically a large integer space.
2. **Ring Structure**
   - The hash space forms a ring, and each node is assigned a position on this ring, based on the hash identifier (eg: ip or node name)
3. **Key Assignment**
    - When keys needs to be stored or looked up, its hash is computed using the same hash function. The key is then placed on the ring at the position corresponding to its hash value.
4. **Node Assignment**
   - Similarly, when each node is also placed on the ring based on the hash of its identifier.
5. **Locating a Key**
   - To locate the node responsible for a particular key, you find the position of the key on the ring. Moving clockwise on the ring, you locate the first node encountered, and that node becomes responsible for the key.
6. **Adding or Removing Nodes**
    - When a new node is added or an existing node is removed, only a fraction of keys need to be remapped. Most of the keys remain assigned to the same nodes, minimizing the impact of the system.

## Consistent hashing offers several advantages:

- **Load Balancing:** Keys are distributed across nodes uniformly, providing a balanced distribution of load.
- **Scalability:** When nodes are added or removed, the majority of keys are unaffected, allowing for smooth scaling.
- **Fault Tolerance:** When a node fails or is removed, only the keys assigned to that node need to be remapped.
- **Predictable Key Assignment:** The hash function and ring structure ensure a predictable mapping of keys to nodes, simplifying the lookup process.

Despite its advantages, consistent hashing has some limitations, such as potential "hot spots" (uneven distribution of keys)
and the need for a good hash function.


**Virtual nodes** are introduced in consistent hashing to address potential uneven distribution of keys and improve load balancing.
Instead of mapping each physical node to a single point on the hash ring, virtual nodes allow each physical node to be represented by multiple points.
This means a single physical node is responsible for multiple positions on the ring.
## How virtual node works?

1. **Virtual Nodes Assignment:**
   - Each physical node is associated with multiple virtual nodes, each placed at different positions on the hash ring.
   - The more virtual nodes a physical node has, the more positions it occupies on the ring.
2. **Improved Load Balancing:**
   - With virtual nodes, the keys are distributed more evenly across the ring.
   - This helps mitigate the potential for hot spots where a single node may end up responsible for a disproportionately large number of keys.
3. **Increased Granularity:**
   - Virtual nodes increase the granularity of the assignment, making it more likely that keys are evenly distributed among nodes.
   - This is especially beneficial when the number of physical nodes is small, and the hash space is large.
4. **Balancing Impact of Adding/Removing Nodes:**
   - When a physical node is added or removed, the impact is spread across its virtual nodes rather than affecting all keys assigned to the node.
   - This results in a smoother transition and minimizes the need for remapping a large number of keys.
5. **Reduced Hot Spots:**
   - In scenarios where a single physical node becomes bottleneck due to high load, introducing virtual node helps distribute the load more evenly across multiple partitions occupied by that node.
6. **Implementation:**
    - The virtual node can be generated by  applying the hash function multiple times to the identifier of each physical node, creating a set of virtual positions on the ring.