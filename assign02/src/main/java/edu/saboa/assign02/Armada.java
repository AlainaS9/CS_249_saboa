package edu.saboa.assign02;

import java.util.*;

public class Armada {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        SpaceVessel vessel = new SpaceVessel();
        String name;
        String line;

        System.out.println("Enter vessel name:");
        name = userInput.nextLine();

        System.out.println("Enter length and weight:");
        line = userInput.nextLine();
        Scanner parseLine = new Scanner(line);
        int shipLength = parseLine.nextInt();
        int shipWeight = parseLine.nextInt();

        vessel.setName(name);
        vessel.setLength(shipLength);
        vessel.setWeight(shipWeight);
        System.out.println(vessel.toString());

    }
}