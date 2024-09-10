package edu.saboa.exercises00;
//import edu.saboa.items.*;

public class Nothing {
    public static void main(String [] args) {
        NPC bob = new NPC();
        NPC susan = new NPC("SUSAN");
        //bob.health = 76;

        System.out.println("Bob's health: " + bob.getHealth());

        bob.setHealth(50);

        System.out.println("Bob's health again: " + bob.getHealth());
        System.out.println("Susan's health: " + susan.getHealth());

        //Weapon w = new Weapon();
    }
}

