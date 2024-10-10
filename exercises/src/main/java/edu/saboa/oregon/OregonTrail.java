package edu.saboa.oregon;

import java.util.*;
import edu.saboa.exercises03.Supplies;

public class OregonTrail {
    public static void main(String [] args) {
        System.out.println("Arg cnt: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }

        Scanner input = new Scanner(System.in);
        // Set the starting supplies
        Supplies supplies = new Supplies();

        System.out.println("Enter starting food: ");
        int food = input.nextInt();
        supplies.addFood(food);
        System.out.println(supplies);

        // Set who is in the party
        Party party = Party.askForPartyMembers(input);

        int milesTraveled = 0;
        double rations = 7.0;
        int dayCnt = 0;

        WagonPace pace = WagonPace.NORMAL;

        while (!isGameOver(party, supplies, milesTraveled)) {

            // For each day

            // Eat food
            boolean fed = eatFoodForDay(party, supplies, rations);


            // Add to distance
            milesTraveled += (int)pace.getMilesPerDay();

            dayCnt++;

            // Check if we ran out of food
            // If yes, we instantly perish
            if(!fed) {
                party.killEveryone();
            }


            // Are ya winning son?

            printStatus(dayCnt, milesTraveled, party, supplies, pace);

            // ask for change of pace
            System.out.println("Change pace? [y/n]");
            String ans = input.next();
            if(ans.equals("y")) {
                System.out.println("Select pace:");
                for(int i = 0; i < WagonPace.values().length; i++) {
                    System.out.println((i+1) + ": " + WagonPace.values()[i]);
                }
                int choice = input.nextInt();
                choice--;

            }
        }
    }

        public static boolean isGameOver(Party party, Supplies supplies, int milesTraveled) {

        final int MILES_TO_OREGON = 2000;

        return ((milesTraveled >= MILES_TO_OREGON) || (party.getPartyCnt() == 0));

        }

        public static boolean eatFoodForDay (Party party, Supplies supplies, double rations) {

            double foodPerDay = rations*party.getPartyCnt();
            double foodEaten = supplies.removeFood(foodPerDay);

            final double EPS = 1e-7;

            if(Math.abs(foodPerDay - foodEaten) < EPS){
                return true;
            }
            else {
                return false;
            }
        }

        public static void printStatus (int dayCnt, int milesTraveled, Party party, Supplies supplies, WagonPace pace) {
        String boundary = "*************************";
        System.out.println(boundary);
        System.out.println("DAY " + dayCnt);
        System.out.println(boundary);
        System.out.println("CURRENT PACE: " + pace);

        System.out.println("Traveled " + milesTraveled + " miles");
        System.out.println(boundary);
        System.out.println(party);
        }



}
