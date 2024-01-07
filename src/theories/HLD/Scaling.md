
# Scaling

- The capability of a sytem to handle the increased load, data or traffic.
- The goal is to ensure that the sytem is able to maintain or improve its performace with demands. And works in fail safe manner.

## There are 2 type of scaling.

### Vertical Scaling
This involves the increasing capacity of single server, by adding powerful hardware RAM, CPU etc.

**Pros**
1. Simplifies management, with fewer servers to manage it reduces operational overhead.

2. Suitable for applications with moderate scaling needs

**Cons**

1. Limited by hardware constraints, after all there is limit for hardware improvements.

2. Improved hardware will increase the cost, because the more advance or improved the tech is the costlier it gets.

[VerticalScale.img](https://www.cloudzero.com/wp-content/uploads/2023/10/how-vertical-scaling-works-1.webp)


### Horizontal Scaling
This involves adding more servers to distribute the load across multiple machines.
Here each server operates independently, and the workload is divided among them.

**Pros**

1. Improved scalability, allows the system to scale indefinitely on demand (ofcourse it needs cash :P ). This also help in scaling down the system when demand is not that high to save cost. Imagine what amazon was doing during big billion days.

2. Cost-effective for large scale growth.

**Cons**

1. Increased complexity, requires mechanism for load balancing, distributed data storage, and coordination.

2. Not all applications are easily horizontally scalable. Some will require whole architecture upgrade.

[HorizontalScale.img](https://www.cloudzero.com/wp-content/uploads/2023/10/how-horizontal-scaling-works-1.webp)

### Auto-Scaling

It is an automated process to scale up and down the resources in a system based on the real time demand. It helps with resource utilization and saves cost.


### Load Balancing

Load balancing is a technique used in horizontally scaled systems to distribute the traffic across multiple servers, ensuring no overload happens on particular server.

### Database Scaling

**Vertical Scaling** Involves increasing the capacity of a single database, by upgrading the hardware or other resources.

**Horizontal Scaling** Involves distributing the database load across multiple servers using techniques like sharding or replication.

### Caching

It involves storing frequently accessed data in memory or a faster storage layer to reduce the need to fetch the same data from the backend, improving the response time and reducing server load.
In distributed system it is quite possible a data response is prepared by multiple servers. Caching is very helpful for these kind of scenarios.

### CDN

CDNs are used to distribute the static content, such as images, videos etc. to servers located closer to the user. This reduces the latency and improves overall performance of the system.

### Microservice Architecture

It involves breaking down a monolithic app into a smaller, independent services that can be developed, deployed and  scaled independently. This allows more flexible scaling based on individual service needs.

For example there are 4 services and on Wednesday and Thursday the demand of service 1 and 3 is increases,  so we have this flexibility to scale service 1 and 3 only.

More on this in docker and microservice.

