# Caching

- Caching is a technique to store copies of frequently accessed or computed data in a location that allows for faster retrieval when the same data is needed again.
- The primary goal of caching is to improve the system performance by the reducing the time and resource required to fetch or compute data.

![Cache](https://javachallengers.com/wp-content/uploads/2023/08/cache_systems_design-1.png)
## key concepts of caching:

1. **Cache:**
   - A cache is a temporary storage location that holds copies of data, typically in a faster and more easily accessible form than the original source.
   
2. **Cache Hit and Cache Miss**
   - Cache hit happens when requested data is found in the cache, resulting in fast retrieval.
   - When requested data is not found in cache it is cache miss, then the system needs to fetch the data from original source.
   
3. **Cache Key**
   - A cache key is a unique identifier associated with each piece of data stored in cache. It is used to look up and retrieve the corresponding data.
   
4. **Eviction Policy**
   - It is a strategy employed by caching systems to determine which entries should be removed from cache. When cache reaches its maximum policy. 

   - **Least Recently Used (LRU):** Evicts the least recently accessed items first.
   - **Least Frequently Used (LFU):** Evicts the least frequently accessed items first.
   - **First In First Out (FIFO):** Evicts the oldest entries first. 

5. **Write-Through and Write-Behind Caching**
   - Write-Through Caching:
     - In write through caching, data is written to both the cache and the underlying data store simultaneously.
     - This ensures the cache and the data store are always consistent.
     - While this approach maintains data integrity, it can introduce latency, as every write operation involves updating both the cache and the data store.
   - Write-Behind Cache:
     - In write-behind caching, data is initially written only to the cache, and the actual write to the underlying data to store is deferred until a later time.
     - This approach can improve write performance, as the application does not need to wait for the slower data store write operation to complete.
     - However, it introduces the risk of data inconsistency between the cache and the data store.

6. **Cache Mechanisms**
   1. **Cache Mapping Mechanisms**

      1. **Direct-Mapped Cache:**
          - Each block of main memory maps to exactly one cache line. May lead to cache conflicts.

      2. **Set-Associative Cache:**
          - A compromise between direct-mapped and fully associative caches. Memory is divided into a set of lines with multiple cache lines per set.

      3. **Fully Associative Cache:**
          - Any block of main memory can be placed in any cache line. Offers maximum flexibility but requires additional hardware.

   2. **Cache Write Policies**

      1. **Write-Through Cache:**
          - Data is simultaneously written to both the cache and main memory to ensure consistency.

      2. **Write-Behind Cache:**
          - Data is initially written to the cache; write to main memory is deferred, improving write performance.

      3. **Write-Around Cache:**
          - Data is written directly to main memory, bypassing the cache. Suitable for infrequently accessed data.

      4. **Write-Allocating Cache:**
          - Brings the entire block of data into the cache upon a write miss.

      5. **No-Write-Allocating Cache:**
          - Only the specific words being written are brought into the cache.

      6. **Random:**
         - Randomly selects a cache line to be replaced when a new line needs to be loaded.

   3. Other Cache Mechanisms 
      1. **Content Addressable Memory (CAM):**
         - Allows for content-based addressing, commonly used in caches for quick data retrieval based on content.
   
      2. **Multi-Level Caching:**
         - Systems use multiple levels of caching (e.g., L1, L2, and L3 caches) to optimize data access at different levels of the memory hierarchy.

      3. **Caching in Web Browsers:**
         - Web browsers use caching to store copies of web pages, images, and resources locally, reducing the need to re-download when revisiting websites.

      4. **Content Delivery Network (CDN) Caching:**
         - CDNs use caching at various server locations to store copies of static content, reducing latency and improving content delivery.

    The choice of a specific cache mechanism depends on factors such as the system architecture, access patterns, and specific requirements of the application or use case. Different mechanisms are suitable for different scenarios, and a combination of these mechanisms is often used to achieve optimal performance.

7. Cache Levels

    Level 1 (L1) Cache:
   - **Location:** L1 cache is the smallest and fastest cache, located directly on the CPU chip.
   - **Purpose:** It stores a small amount of critical data and instructions that the CPU is currently working on.
   - **Size:** Typically a few kilobytes in size.
   - **Access Time:** Extremely fast access times, providing low latency for the CPU.

    Level 2 (L2) Cache:
   - **Location:** L2 cache is larger than L1 cache and is often located on the CPU chip or on a separate chip very close to the CPU.
   - **Purpose:** It stores additional data and instructions that may not fit in the L1 cache, serving as a secondary, slightly slower cache.
   - **Size:** Larger than L1 cache, usually ranging from a few hundred kilobytes to a few megabytes.
   - **Access Time:** Faster than main memory but slower than L1 cache.

   Level 3 (L3) Cache:
   - **Location:** L3 cache is the largest among the three and is shared among multiple CPU cores within a processor or across multiple processors.
   - **Purpose:** It provides a larger pool of cache memory for the entire processor or multiple cores to share, reducing memory access latency.
   - **Size:** Larger than L2 cache, often several megabytes.
   - **Access Time:** Slower than L1 and L2 caches but faster than accessing main memory.

The purpose of having multiple cache levels is to exploit the principle of locality in program behavior, maximizing the chances of having the required data readily available for the CPU and minimizing the time spent waiting for data to be fetched from slower main memory.

Cache memory plays a crucial role in improving the overall performance of a computer system by bridging the speed gap between the CPU and main memory.
