package designPatterns.behavioralPatterns.strategy;

import designPatterns.creationalPatterns.factory.Catalog;
import designPatterns.creationalPatterns.factory.WeaponFactory;
import designPatterns.behavioralPatterns.strategy.weapons.GrappleHook;
import designPatterns.behavioralPatterns.strategy.weapons.LaserGun;

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
