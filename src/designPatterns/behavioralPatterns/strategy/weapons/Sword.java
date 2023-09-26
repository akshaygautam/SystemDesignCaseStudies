package designPatterns.behavioralPatterns.strategy.weapons;

import designPatterns.behavioralPatterns.strategy.Weapon;

public class Sword implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Sword");
    }
}
