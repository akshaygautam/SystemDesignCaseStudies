package designPatterns.structuralPatterns.flyweight;

import java.util.*;

public class RobotFactory {
    private static Map<String, Robot> robotMap = new HashMap<>();

    public static Robot getRobot(String robotType) {
        Robot robot = robotMap.get(robotType);

        if (robot == null) {
            robot = new SharedRobot(robotType);
            robotMap.put(robotType, robot);
        }

        return robot;
    }
}
