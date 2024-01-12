# Data Partitioning / Sharding

Data partitioning also known as sharding, is a database design technique where large database are broken down into smaller,
more manageable pieces called partitions or shards.
Each shard is then stored in a separate server or node. This approach helps distribute the data and workload, improving
scalability, performance, and reliability.

## Types of Data Partitioning:

### 1. Horizontal Partitioning  [Code](../../caseStudies/sharding/HorizontalPartitioning.java):
- Divides data into multiple partitions, each containing a subset of rows based on a certain condition.

### 2. Vertical Partitioning [Code](../../caseStudies/sharding/VerticalPartitioning.java):
- Divides a table into partitions with columns, putting a subset of columns in each partition.
- This is useful when some columns are accessed more frequently than others.

### 3. Directory-Based Partitioning [Code](../../caseStudies/sharding/DirectoryBasedPartitioning.java):
- A metadata-based partitioning where a directory or lookup table maps data to specific partitions.

### 4. Functional Partitioning [Code](../../caseStudies/sharding/FunctionalPartitioning.java):
- Involves partitioning based on a specific function or algorithm.

## Best Practices:
1. **Understand access patterns:** Analyze how data is accessed to determine the most effective partitioning strategy.
2. **Consider data distribution:** Aim for uniform data distribution across partitions to prevent hotspots and ensure balanced utilization.
3. **Choose appropriate key:** Select partition keys that evenly distribute data and match the application's query patterns.
4. **Size Consistency:** Keep partition sizes consistent to prevent large partitions from impacting performance.
5. **Replication and Fault tolerance:** Implement replication for fault tolerance. Each partition should have redundant copies on different nodes.
6. **Avoid Over-Partitioning:** Too many partitions can lead to increased overhead. Strike a balance between partitioning and the simplicity of managing the system.
7. **Regular Maintenance:** Periodically review and adjust partitioning strategies based on changing data patterns and system requirements.

## Pros:
1. **Improved Performance:** Parallel processing across multiple nodes can significantly enhance query performance.
2. **Scalability:** Easily scale the system by adding more nodes, as each node is responsible for a specific partition.
3. **Efficient Resource Utilization:** Efficiently use resources by distributing the workload across multiple nodes.
4. **Isolation of Data:** Each partition is a separate unit,  allowing for independent maintenance and optimization.

## Cons:
1. **Complexity:** Data partitioning introduces complexity in terms of design, implementation and maintenance.
2. **Join and Transactions:** Operations involving multiple partitions (joins, transactions) can be more complex to execute.
3. **Data Skew:** Uneven distribution of data across partition may lead to data skew and impact performance.
4. **Limited Query Flexibility:** Certain queries may become more challenging or less efficient due to the partition strategy.
5. **Maintenance Overhead:** Regular maintenance is required to re-balance data, especially in dynamic systems.

## Use cases:
1. **Large Datasets:** Ideal for databases with large datasets that need to be distributed for performance reasons.
2. **Highly concurrent workloads:** Effective for systems experiencing high level of concurrent read and write operations.
3. **Scalability Requirements:** Valuable when scalability is critical requirement and a single node is no longer sufficient.
4. **Isolation of Workloads:** Useful when different types of data or workloads can be logically separated.
5. **Multi-Tenant Application:** Suitable for multi-tenant applications where each tenant's data can be isolated.