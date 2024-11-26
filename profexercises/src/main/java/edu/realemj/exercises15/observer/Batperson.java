package edu.realemj.exercises15.observer;

public class Batperson implements Observer {
    private String name = "";

    public Batperson(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void update(Subject s) {
        if(s instanceof Batsignal b) {
            String crime = b.getActiveCrime();
            System.out.println("This is " + name
                + ", responding to " + crime);
        }
    }

}
