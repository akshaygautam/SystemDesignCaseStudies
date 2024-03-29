package designPatterns.behavioralPatterns.strategy;

public class SuperHero {
    private Weapon weapon;

    public SuperHero(Weapon weapon) {
        this.weapon = weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        this.weapon.useWeapon();
    }
}
