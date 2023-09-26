package designPatterns.structuralPatterns.flyweight;

public class SharedRobot implements Robot{
    private String robotType;

    public SharedRobot(String robotType) {
        this.robotType = robotType;
    }
    @Override
    public void display(String color) {
        System.out.println("Robot Type: " + robotType + ", Color: " + color);
    }
}
