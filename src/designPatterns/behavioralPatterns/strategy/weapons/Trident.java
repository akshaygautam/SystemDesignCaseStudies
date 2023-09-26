package designPatterns.behavioralPatterns.strategy.weapons;

import designPatterns.behavioralPatterns.strategy.Weapon;

public class Trident implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Trident");
    }
}
