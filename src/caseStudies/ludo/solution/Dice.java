package caseStudies.ludo.solution;

import java.util.Random;

public class Dice {
    int roll() {
        return new Random().nextInt(6) + 1;
    }
}
