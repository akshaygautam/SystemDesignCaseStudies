# CAP Theorem

![CAP](https://media.licdn.com/dms/image/C5112AQFbYSaM_qyt8A/article-cover_image-shrink_600_2000/0/1540791647576?e=2147483647&v=beta&t=qpVLQlOnqRpa0YXnqHOUNSV321HgRhXcm1xB79rv8bo)

CAP theorem states that it is impossible for a distributed system to simultaneously provide all three of the following guarantees

1. **Consistency (C):**
   - All nodes in the system see the same data at the same time. In other words, read operation on any node will return the most recent write operation performed on any node.
2. **Availability (A):**
   - Every request to the system receives a response, without guarantee that it contains the most recent version of the information.
   - Availability means every request is guaranteed a response, not necessarily successful response.
3. **Partition Tolerance (P):**
   - The system continues to operate despite network partitions (communication failures) between nodes.
   - In a distributed system, nodes may be physically separated and can fail to communicate with each other.

According to CAP theorem, a distributed system can achieve at most two out of the three guarantees.

## Consistency.

Consistency in distributed systems can be categorized into different levels, often referred to as the "CAP Consistency Models".

1. **Strong Consistency:**
   - **Pros:** 
     - Guarantees that all nodes in the system will have the most recent write before allowing any read operation.
     - Provides a familiar and straightforward programming model.
   - **Cons:**
     - Many result in increased latency as it waits for all nodes to be updated.
     - Can lead to reduced availability, especially in the presence of network partitions.
2. **Causal Consistency:**
   - **Pros:**
     - Provides a middle ground between strong consistency and eventual consistency.
     - Allows for a more relaxed order between operations, improving system performance.
   - **Cons:**
     - Implementation cam be more complex than strong consistency.
     - Developers need to be aware of causality relationships between operations.
3. **Eventual Consistency:**
   - **Pros:**
     - Maximizes availability and partition tolerance, making it suitable for highly distributed systems.
     - Reduces latency by allowing nodes to continue operations without waiting for synchronization.
   - **Cons:**
     - May result in temporary inconsistency between nodes, which could be more problematic for certain applications.
     - Developers need to handle conflicts and resolution strategies.
4. **Read Your Writes Consistency:**
   - **Pros:**
     - Guarantees that after a write operation, the same node(or nodes) will always see its own writes.
     - Provides a more predicable behaviour for users interacting with the system.
   - **Cons:**
     - May introduce additional latency for read operations, especially in distributed environments.
     - Can be challenging to maintain in systems with high write and read loads.
5. **Monotonic Reads and Writes Consistency:**
    - **Pros:**
      - Guarantees that if a process reads its own writes, it will not see older values when subsequent reads are performed.
      - Ensures a consistent view of data for the issuing process.
    - **Cons:**
      - May lead to increased latency, especially in scenarios with high contention for resources.
      - Can be challenging to achieve in systems with distributed and asynchronous operations.
6. **Session Consistency:**
   - **Pros:**
     - Similar to "Read Your Writes" but extends consistency guarantees to a specific user session.
     - Provides a balance between strong and eventual consistency.
   - **Cons:**
     - Requires additional mechanisms to track and manage user sessions.
     - May still exhibit inconsistencies if not implemented correctly.
