package edu.saboa.exercises03;

public class SimpleOregon {
    public static void main(String [] args){
        System.out.println("WELCOME!");
        Scanner input = new Scanner(System.in);

        double totalFood = input.nexDouble();
        int numPeople = input.nextInt();
        int ration = input.nextInt();

        int totalDays = (int)totalFood/(numPeople*ration);

        System.out.println("TOTAL DAYS: " + totalDays);
    }
}
