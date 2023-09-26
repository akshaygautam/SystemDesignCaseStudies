package designPatterns.template.superHero;

import java.util.*;

public abstract class Superhero {
    public final void fightCrime() {
        putOnCostume();
        travelToCrimeScene();
        doSpecificStrategyToGetEvidence();
        doSpecificStrategyToFight();
        celebrate();
    }

    private void putOnCostume() {
        System.out.println("Putting on costume...");
    }

    private void travelToCrimeScene() {
        System.out.println("Travelling to crime scene....");
    }

    protected abstract void doSpecificStrategyToGetEvidence();

    protected abstract void doSpecificStrategyToFight();

    private void celebrate() {
        System.out.println("Celebrating victory!!");
    }
}
