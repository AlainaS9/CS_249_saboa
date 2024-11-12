package edu.saboa.exercises13;

public class Face {
    private int [] indices = new int[3];

    public int getIndex(int pos) {
        return indices[pos];
    }

    public void getIndex(int pos, int val) {
        indices[pos] = val;
    }
}
