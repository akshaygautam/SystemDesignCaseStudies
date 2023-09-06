package designPatterns.strategy.weapons;

import designPatterns.strategy.Weapon;

import java.util.*;

public class Sword implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Sword");
    }
}
