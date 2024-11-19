package edu.saboa.exercises15.strategy;

public class BearSim {
    public static void main(String [] args) {
        Bear yogi = new GrizzlyBear();
        Bear pooh = new TeddyBear();

        yogi.performMove();
        pooh.performMove();

        pooh.setMoveBehavior(new MoveWithFourLegs());
        pooh.performMove();
    }
}
