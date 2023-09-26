package designPatterns.creationalPatterns.prototype;

public class CuteMonster implements Monster{
    private String name;
    private String color;
    private String sound;

    public CuteMonster(String name, String color, String sound) {
        this.name = name;
        this.color = color;
        this.sound = sound;
    }

    public void scare() {
        System.out.println("Boo! I'm " + color + " " + name + " and I say '" + sound + "'!");
    }

    public Monster clone() {
        try {
            return (Monster) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
