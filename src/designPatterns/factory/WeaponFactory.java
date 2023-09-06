package designPatterns.factory;

import designPatterns.strategy.Weapon;
import designPatterns.strategy.weapons.LaserGun;
import designPatterns.strategy.weapons.Trident;

import java.util.*;

public class WeaponFactory {
    public Weapon createWeapon(Catalog catalog){
        switch (catalog){
            case TRIDENT:
                return new Trident();
            case LASER_GUN:
                return new LaserGun();
            case C4:
            case GRAPPLE_HOOK:
            case SNIPER:
            case BATARANG:
                System.out.println(catalog.name() + " Not in inventory");
            default: return new Weapon() {
                @Override
                public void useWeapon() {
                    System.out.println("WATER GUN ATTACK :p");
                }
            };
        }
    }
}
