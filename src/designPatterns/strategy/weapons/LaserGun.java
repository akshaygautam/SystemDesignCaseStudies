package designPatterns.strategy.weapons;

import designPatterns.strategy.Weapon;

import java.util.*;

public class LaserGun implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Laser gun");
    }
}
