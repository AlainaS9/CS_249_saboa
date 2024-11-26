package edu.realemj.exercises15.observer;

import java.util.*;

public class Batsignal implements Subject {
    private ArrayList<Observer> obsList = new ArrayList<>();
    private String activeCrime = "";

    @Override
    public void registerObserver(Observer obs) {
        obsList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        obsList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: obsList) {
            obs.update(this);
        }
    }

    public String getActiveCrime() {
        return activeCrime;
    }

    public void setActiveCrime(String crime) {
        activeCrime = crime;
        notifyObservers();
    }



}
