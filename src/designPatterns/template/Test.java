package designPatterns.template;

import designPatterns.template.robots.BreakDanceRobot;
import designPatterns.template.robots.DancingRobot;
import designPatterns.template.robots.DiscoRobot;
import designPatterns.template.superHero.Batman;
import designPatterns.template.superHero.Superhero;
import designPatterns.template.superHero.Superman;

public class Test {
    public static void main(String[] args) {
        DancingRobot robot = new BreakDanceRobot();
        robot.dance();
        robot = new DiscoRobot();
        robot.dance();


        Superhero batman = new Batman();
        Superhero superman = new Superman();
        batman.fightCrime();
        superman.fightCrime();
    }
}
