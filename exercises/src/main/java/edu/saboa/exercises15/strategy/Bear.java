package edu.saboa.exercises15.strategy;

public abstract class Bear {
    protected Moveable moveBehavior;

 //   public Bear(Moveable m) {

  //  }

    public void performMove() {
        moveBehavior.move();
    }

    public void setMoveBehavior(Moveable m) {
        moveBehavior = m;
    }
}
