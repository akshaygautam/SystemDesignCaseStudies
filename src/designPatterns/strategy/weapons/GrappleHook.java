package designPatterns.strategy.weapons;

import designPatterns.strategy.Weapon;

import java.util.*;

public class GrappleHook implements Weapon {
    @Override
    public void useWeapon() {
        System.out.println("Using Grapple Hook");
    }
}
