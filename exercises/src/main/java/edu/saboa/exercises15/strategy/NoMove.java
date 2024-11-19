package edu.saboa.exercises15.strategy;

public class NoMove implements Moveable {
    public void move() {
        System.out.println("<nothing>");
    }
}
