package designPatterns.behavioralPatterns.memento;

import java.util.*;

public class PotionHistory {
    private List<FrogMemento> history = new ArrayList<>();

    public void saveState(FrogMemento memento) {
        history.add(memento);
    }

    public FrogMemento getState(int index) {
        return history.get(index);
    }
}
