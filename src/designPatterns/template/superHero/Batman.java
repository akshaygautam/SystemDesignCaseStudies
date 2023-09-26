package designPatterns.template.superHero;

import java.util.*;

public class Batman extends Superhero{
    @Override
    protected void doSpecificStrategyToGetEvidence() {
        System.out.println("Wear X-Ray Vision Goggles");
    }

    @Override
    protected void doSpecificStrategyToFight() {
        System.out.println("Karate chopping the criminal");
    }
}
