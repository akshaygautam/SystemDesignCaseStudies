package designPatterns.strategy;

import designPatterns.factory.Catalog;
import designPatterns.factory.WeaponFactory;
import designPatterns.strategy.weapons.GrappleHook;
import designPatterns.strategy.weapons.LaserGun;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        SuperHero batman = new SuperHero(new GrappleHook());
        batman.attack();
        batman.changeWeapon(new LaserGun());
        batman.attack();

        WeaponFactory factory = new WeaponFactory();
        batman.changeWeapon(factory.createWeapon(Catalog.TRIDENT));
        batman.attack();

        batman.changeWeapon(factory.createWeapon(Catalog.C4));
        batman.attack();
    }
}
