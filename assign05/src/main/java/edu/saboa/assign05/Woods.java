package edu.saboa.assign05;

import java.util.*;

public class Woods {

    private ArrayList<Giant> giantsList = new ArrayList<>();

    public Giant createGiant(String name, String typeName) {
        if(name.isEmpty()) {
            return null;
        }
        else {
            return switch (typeName) {
                case "GIANT" -> new Giant(name);
                case "TROLL" -> new Troll(name);
                case "TREE" -> new Tree(name);
                case "ENT" -> new Ent(name);
                case "HUORN" -> new Huorn(name);
                default -> null;
            };
        }
    }

    public boolean addGiant(String name, String typeName) {
        Giant newGiant = createGiant(name, typeName);
        if(newGiant != null) {
            giantsList.add(newGiant);
            return true;
        }
        else {
            return false;
        }
    }

    public Giant getGiant(int index) {
        if(index >= 0 && index < giantsList.size()) {
            return giantsList.get(index);
        }
        else {
            return null;
        }
    }

    public void printAllGiants() {
        System.out.println("ALL GIANTS:");
        for (Giant giant : giantsList) {
            System.out.println("- " + (giant.toString()));
        }
    }

    public void printAllTrees() {
        System.out.println("ALL TREES:");
        for (Giant giant : giantsList) {
            if (giant instanceof Tree) {
                Tree t = (Tree) giant;
                System.out.println("- " + t.toString() + ": " + t.speak());
            }
        }
    }

    public void printAllTrolls() {
        System.out.println("ALL TROLLS:");
        for (Giant giant : giantsList) {
            if (giant instanceof Troll) {
                Troll tr = (Troll) giant;
                System.out.println("- " + tr.toString() + ": " + tr.cook());
            }
        }
    }
}
