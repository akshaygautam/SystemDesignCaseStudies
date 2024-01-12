package caseStudies.sharding;

import java.util.HashMap;
import java.util.Map;
public class VerticalPartitioning {
    private final Map<String, BasicUserInfo> basicInfoPartition;
    private final Map<String, ContactInfo> contactInfoPartition;

    public VerticalPartitioning() {
        basicInfoPartition = new HashMap<>();
        contactInfoPartition = new HashMap<>();
    }

    public void addUser(String userId, BasicUserInfo basicInfo, ContactInfo contactInfo) {
        basicInfoPartition.put(userId, basicInfo);
        contactInfoPartition.put(userId, contactInfo);
    }

    public BasicUserInfo getBasicUserInfo(String userId) {
        return basicInfoPartition.get(userId);
    }

    public ContactInfo getContactInfo(String userId) {
        return contactInfoPartition.get(userId);
    }

    public static void main(String[] args) {
        VerticalPartitioning verticalPartitioning = new VerticalPartitioning();

        // Create users
        BasicUserInfo basicInfo1 = new BasicUserInfo("Alice", 25);
        ContactInfo contactInfo1 = new ContactInfo("alice@example.com", "123-456-7890");

        BasicUserInfo basicInfo2 = new BasicUserInfo("Bob", 30);
        ContactInfo contactInfo2 = new ContactInfo("bob@example.com", "987-654-3210");

        // Add users to partitions
        verticalPartitioning.addUser("userId1", basicInfo1, contactInfo1);
        verticalPartitioning.addUser("userId2", basicInfo2, contactInfo2);

        // Retrieve user information from partitions
        BasicUserInfo retrievedBasicInfo = verticalPartitioning.getBasicUserInfo("userId1");
        ContactInfo retrievedContactInfo = verticalPartitioning.getContactInfo("userId1");

        System.out.println("Basic Info: " + retrievedBasicInfo);
        System.out.println("Contact Info: " + retrievedContactInfo);
    }


    static class BasicUserInfo {
        private String name;
        private int age;

        public BasicUserInfo(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "BasicUserInfo{name='" + name + "', age=" + age + '}';
        }
    }

    static class ContactInfo {
        private String email;
        private String phone;

        public ContactInfo(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "ContactInfo{email='" + email + "', phone='" + phone + "'}";
        }
    }

}
