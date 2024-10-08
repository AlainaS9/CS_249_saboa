package edu.saboa.assign03;

import java.util.*;

public class Hallmark {
    public static GreetingCard generateCard(Scanner input){
        System.out.println("Enter boundary character: ");
        char boundaryChar = getBoundaryChar.input.nextLine();

        System.out.println("Enter number of lines: ");
        String line = input.nextLine();
        int linesNum = Integer.parseInt(line);

        String[] allLines = new String[linesNum];
        System.out.println("Enter lines: ");
        for(int i = 0; i < linesNum; i++){
            allLines[i] = input.nextLine();
        }

        GreetingCard card = new GreetingCard(allLines, boundaryChar);
        return card;
    }

    public static void main(String [] args) {
        Scanner cardInput = new Scanner(System.in);
        GreetingCard n = generateCard(cardInput);
        System.out.println("For any occasion: ");
        System.out.println(n);

    }
}
