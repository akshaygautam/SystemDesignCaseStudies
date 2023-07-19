package caseStudies.SnakeLadder;

import java.util.*;

public class Snake {
    private final int head, tail;

    public Snake(int head, int tail) {
        this.head = head;
        this.tail = tail;
    }

    public int getHead() {
        return head;
    }
    public int getTail() {
        return tail;
    }
    public int bite(){
        System.out.println("OH! A snake bit you at"+this.head+", move to "+ this.tail);
        return tail;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
