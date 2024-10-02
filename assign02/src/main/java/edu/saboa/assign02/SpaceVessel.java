package edu.saboa.assign02;

public class SpaceVessel {
    private String vesselName = "";
    private int length = 0;
    private int weight = 0;

    public String getName() {
        return vesselName;

    }

    public int getLength() {
        return length;

    }

    public int getWeight() {
        return weight;

    }

    public void setName(String name) {
        vesselName = name;

    }

    public void setLength(int feet) {
        length = feet;

    }

    public void setWeight(int pounds) {
        weight = pounds;

    }

    public String getLengthString() {
        double meters = 0.3048 * length;

        String lengthString;
        lengthString = length + " ft. (" + String.format("%.2f", meters) + " m)";
        return lengthString;

    }

    public String getWeightString() {
        double kilograms = 0.4536 * weight;

        String weightString;
        weightString = weight + " lbs. (" + String.format("%.2f", kilograms) + " kg)";
        return weightString;
    }

    public String toString() {
        String s = "";
        s += "NAME: " + vesselName + "\n";
        s += "LENGTH: " + getLengthString() + "\n";
        s += "WEIGHT: " + getWeightString() + "\n";
        return s;

    }

}
