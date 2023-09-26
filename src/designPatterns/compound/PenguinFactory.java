package designPatterns.compound;

import java.util.*;

public class PenguinFactory {
    public static Penguin createPenguin(String name) {
        return new Penguin(name);
    }
}
