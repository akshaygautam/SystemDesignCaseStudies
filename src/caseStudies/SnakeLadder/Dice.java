package caseStudies.SnakeLadder;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceCount;
    private final int MAX = 6, MIN=1;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        System.out.println("Rollinggggggg");
        int value = 0;
        int diceUsed = 0;
        while (diceUsed++ < diceCount){
            value += ThreadLocalRandom.current().nextInt(MIN, MAX+1);
        }
        System.out.println("Dice got value : "+ value);
        return value;
    }
}
