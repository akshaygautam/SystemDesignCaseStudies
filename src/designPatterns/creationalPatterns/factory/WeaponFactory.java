package designPatterns.creationalPatterns.factory;

import designPatterns.behavioralPatterns.strategy.Weapon;
import designPatterns.behavioralPatterns.strategy.weapons.LaserGun;
import designPatterns.behavioralPatterns.strategy.weapons.Trident;

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
