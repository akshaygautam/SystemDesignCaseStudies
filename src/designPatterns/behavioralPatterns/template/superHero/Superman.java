package designPatterns.behavioralPatterns.template.superHero;

public class Superman extends Superhero{
    @Override
    protected void doSpecificStrategyToGetEvidence() {
        System.out.println("Superman can see through things...");
    }

    @Override
    protected void doSpecificStrategyToFight() {
        System.out.println("Hitting with the laser eye");
    }
}
