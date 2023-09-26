package designPatterns.behavioralPatterns.template.superHero;

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
