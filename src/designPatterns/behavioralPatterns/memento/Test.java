package designPatterns.behavioralPatterns.memento;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog();
        PotionHistory history = new PotionHistory();

        frog.drinkPotion();
        history.saveState(frog.saveToMemento());

        frog.drinkPotion();
        history.saveState(frog.saveToMemento());

        FrogMemento princeMemento = history.getState(0);
        frog.restoreFromMemento(princeMemento);

        FrogMemento frogMemento = history.getState(1);
        frog.restoreFromMemento(frogMemento);
    }
}
