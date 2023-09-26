package designPatterns.behavioralPatterns.chainOfResponsibility;

import designPatterns.behavioralPatterns.chainOfResponsibility.handlers.Level1SupportHandler;
import designPatterns.behavioralPatterns.chainOfResponsibility.handlers.Level2SupportHandler;
import designPatterns.behavioralPatterns.chainOfResponsibility.handlers.Level3SupportHandler;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1SupportHandler();
        SupportHandler level2 = new Level2SupportHandler();
        SupportHandler level3 = new Level3SupportHandler();

        level1.setNextHandler(level2).setNextHandler(level3);

        String[] issues = {"Can't connect to the internet", "Computer crashed", "Software not working"};

        Random random = new Random();
        for (String issue : issues) {
            System.out.println("\nCustomer: I have a problem - " + issue);
            int handlerLevel = random.nextInt(3) + 1; // Randomly choose a support level
            System.out.println("Routing to Level " + handlerLevel + " Support:");
            switch (handlerLevel) {
                case 1:
                    level1.handleRequest(issue);
                    break;
                case 2:
                    level2.handleRequest(issue);
                    break;
                case 3:
                    level3.handleRequest(issue);
                    break;
            }
        }
    }
}
