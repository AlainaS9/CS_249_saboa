package edu.saboa.exercises00;

public class NPC {
    private int health = 100;
    private String name = ""; // null

    public NPC() {}

    public NPC(String n) {
        name = n;
    }

    public int getHealth() {
        return health;
    }

    public boolean setHealth(int h) {
        if (h >= 0 && h <= 100) {
            health = h;
            return true;
        }
        else {
            System.err.println("ERROR: BAD HEALTH");
            return false;
        }
    }

}

class Helper {}
