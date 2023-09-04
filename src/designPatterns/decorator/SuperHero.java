package designPatterns.decorator;

import designPatterns.decorator.costumes.Armour;
import designPatterns.decorator.costumes.BasicCostume;
import designPatterns.decorator.costumes.GrappleHook;
import designPatterns.decorator.costumes.UtilityBelt;

public class SuperHero {
    public SuperHero(){
        System.out.println("Super Hero Getting Ready");
        wearSuit();
    }

    public void wearSuit(){
        Costume costume = new BasicCostume();
//        Costume costumeWithArmour = new Armour(costume);
//        Costume costumeWithArmourAndGrappleHook = new GrappleHook(costumeWithArmour);
//        Costume costumeWithArmourAndGrappleHookAndUtilityBelt = new UtilityBelt(costumeWithArmourAndGrappleHook);
//        costumeWithArmourAndGrappleHookAndUtilityBelt.wear();
        costume = new Armour(costume);
        costume = new GrappleHook(costume);
        costume = new UtilityBelt(costume);
        costume.wear();
    }
}
