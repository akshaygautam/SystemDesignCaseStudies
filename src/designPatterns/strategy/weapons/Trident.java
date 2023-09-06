package designPatterns.strategy.weapons;

import designPatterns.strategy.Weapon;

import java.util.*;

public class Trident implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Trident");
    }
}
