package designPatterns.structuralPatterns.flyweight;

public class Test {
    public static void main(String[] args) {
        Robot redRobot = RobotFactory.getRobot("RedRobot");
        redRobot.display("Red");

        Robot blueRobot = RobotFactory.getRobot("BlueRobot");
        blueRobot.display("Blue");

        Robot greenRobot = RobotFactory.getRobot("GreenRobot");
        greenRobot.display("Green");

        Robot anotherRedRobot = RobotFactory.getRobot("RedRobot");
        anotherRedRobot.display("Crimson");
        System.out.println(anotherRedRobot == redRobot);
    }
}
