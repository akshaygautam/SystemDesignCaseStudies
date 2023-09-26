package designPatterns.iterator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        SuperHeroTeam superHeroTeam = new SuperHeroTeam();
        superHeroTeam.addSuperHero(new SuperHero("Batman"));
        superHeroTeam.addSuperHero(new SuperHero("Superman"));
        superHeroTeam.addSuperHero(new SuperHero("Ironman"));
        superHeroTeam.addSuperHero(new SuperHero("Aquaman"));
        SuperHeroIterator iterator = superHeroTeam.getIterator();
        while (iterator.hasNext()){
            System.out.println("Send to fight: " + iterator.next().getName());
        }


        SuperHeroIterator iterator2 = superHeroTeam.getIterator();
        while (iterator2.hasNext()){
            System.out.println("Send to fight: " + iterator2.next().getName());
        }
    }

}
