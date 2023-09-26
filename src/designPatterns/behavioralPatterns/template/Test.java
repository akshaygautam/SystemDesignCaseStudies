package designPatterns.behavioralPatterns.template;

import designPatterns.behavioralPatterns.template.robots.BreakDanceRobot;
import designPatterns.behavioralPatterns.template.robots.DancingRobot;
import designPatterns.behavioralPatterns.template.robots.DiscoRobot;
import designPatterns.behavioralPatterns.template.superHero.Batman;
import designPatterns.behavioralPatterns.template.superHero.Superhero;
import designPatterns.behavioralPatterns.template.superHero.Superman;

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
