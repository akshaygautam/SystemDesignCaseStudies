package caseStudies.SnakeLadder;

import java.util.*;

public class Ladder {
    private final int bottom, top;

    public Ladder(int bottom, int top) {
        this.bottom = bottom;
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getTop() {
        return top;
    }

    public int climb(){
        System.out.println("Yah! A ladder is found at "+this.bottom+", move to "+ this.top);
        return top;
    }

    @Override
    public String toString() {
        return "Ladder{" +
                "bottom=" + bottom +
                ", top=" + top +
                '}';
    }
}
