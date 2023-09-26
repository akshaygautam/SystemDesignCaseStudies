package designPatterns.creationalPatterns.prototype;

public interface Monster extends Cloneable{
    Monster clone();
    void scare();
}
