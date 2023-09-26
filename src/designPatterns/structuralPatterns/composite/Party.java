package designPatterns.structuralPatterns.composite;

import designPatterns.structuralPatterns.composite.elements.Band;
import designPatterns.structuralPatterns.composite.elements.Person;

public class Party {
    public static void main(String[] args) {
        PartyElement alice = new Person("alice", 20);
        PartyElement bob = new Person("bob", 24);
        PartyElement hob = new Person("hob", 10);
        Band band = new Band();
        band.addMember(alice);
        band.addMember(bob);

        Band party = new Band();
        party.addMember(band);
        party.addMember(hob);

        int totalFunLevel = party.getFunLevel();
        System.out.println("Total Fun Level of the Party: " + totalFunLevel);

    }
}
