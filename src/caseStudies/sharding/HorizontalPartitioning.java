package caseStudies.sharding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HorizontalPartitioning {
    static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{name='" + name + "', age=" + age + '}';
        }
    }

    private final Map<Integer, List<User>> partitions;

    public HorizontalPartitioning() {
        partitions = new HashMap<>();
    }

    public void addUser(User user) {
        int age = user.getAge();
        partitions.computeIfAbsent(age, k -> new ArrayList<>()).add(user);
    }

    public List<User> getUsersInPartition(int age) {
        return partitions.getOrDefault(age, new ArrayList<>());
    }

    public static void main(String[] args) {
        HorizontalPartitioning horizontalPartitioning = new HorizontalPartitioning();

        // Create users
        User user1 = new User("Alice", 25);
        User user2 = new User("Bob", 30);
        User user3 = new User("Charlie", 25);

        // Add users to partitions
        horizontalPartitioning.addUser(user1);
        horizontalPartitioning.addUser(user2);
        horizontalPartitioning.addUser(user3);

        // Retrieve users in a specific partition
        List<User> usersInPartition25 = horizontalPartitioning.getUsersInPartition(25);
        System.out.println("Users in partition 25: " + usersInPartition25);
    }
}
