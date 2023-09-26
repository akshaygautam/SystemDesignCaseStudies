package designPatterns.iterator;

import java.util.*;

public class SuperHeroTeam {
    private List<SuperHero> superHeroes;

    public SuperHeroTeam() {
        this.superHeroes = new ArrayList<>();
    }

    public void addSuperHero(SuperHero hero){
        superHeroes.add(hero);
    }

    public void removeHero(SuperHero hero){
        superHeroes.remove(hero);
    }

    public SuperHeroIterator getIterator(){
        return new SuperHeroIteratorImpl();
    }

    private class SuperHeroIteratorImpl implements SuperHeroIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return !(index >= superHeroes.size());
        }

        @Override
        public SuperHero next() {
            if(index < superHeroes.size()) return superHeroes.get(index++);
            return null;
        }
    }
}
