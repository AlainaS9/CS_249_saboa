package edu.realemj.exercises15.observer;

public class Superperson implements Observer {
    private String name = "";

    public Superperson(String name) {
        this.name = name;
    }

    public void update(Subject s) {
        if(s instanceof Batsignal b) {
            String crime = b.getActiveCrime();
            System.out.println("I know this isn't my turf, but this is " + name + ", helping out with " + crime);
        }
    }
}
