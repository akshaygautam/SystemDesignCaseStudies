package designPatterns.compound;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        PenguinManager manager = PenguinManager.getInstance();

        manager.addPenguin("Penny");
        manager.addPenguin("Pingu");

        Penguin penny = manager.getPenguin("Penny");
        Penguin pingu = manager.getPenguin("Pingu");

        System.out.println("Penguin 1: " + penny.getName());
        System.out.println("Penguin 2: " + pingu.getName());

        PenguinManager anotherManager = PenguinManager.getInstance();
        System.out.println("Are both managers the same? " + (manager == anotherManager));
    }
}
