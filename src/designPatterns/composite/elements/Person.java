package designPatterns.composite.elements;

import designPatterns.composite.PartyElement;

import java.util.*;

public class Person implements PartyElement {
    private String name;
    private int funLevel;

    public Person(String name, int funLevel) {
        this.name = name;
        this.funLevel = funLevel;
    }

    @Override
    public int getFunLevel() {
        return funLevel;
    }

    public String getName() {
        return name;
    }
}
