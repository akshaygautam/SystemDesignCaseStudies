package designPatterns.behavioralPatterns.memento;

public class Frog {
    private boolean isFrog;

    public void drinkPotion() {
        System.out.println("Drinking potion... Poof!");
        isFrog = !isFrog;
    }

    public FrogMemento saveToMemento() {
        System.out.println(isFrog ? "Saving frog" : "Saving prince");
        return new FrogMemento(isFrog);
    }

    public void restoreFromMemento(FrogMemento memento) {
        isFrog = memento.isFrog();
        System.out.println(isFrog ? "Turned back into a frog" : "Turned into a prince");
    }
}
