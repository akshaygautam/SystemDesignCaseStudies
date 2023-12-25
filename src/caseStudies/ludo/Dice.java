package caseStudies.ludo;


import java.util.Random;

public class Dice {
    public static Dice Instance = new Dice();
    private Dice(){}

    public int roll() {
       return new Random().nextInt(6)+1;
    }
}
