package designPatterns.behavioralPatterns.strategy.weapons;

import designPatterns.behavioralPatterns.strategy.Weapon;

public class GrappleHook implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Grapple Hook");
    }
}
