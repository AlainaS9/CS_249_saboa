package edu.saboa.exercises04;

import java.util.*;

public class InfoCheck {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(i);
            sb.append("...");
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter age and height: ");
        String dataLine = input.nextLine();

        Scanner parseLine = new Scanner(dataLine);
        int age = parseLine.nextInt();
        int height = parseLine.nextInt();

        System.out.println("Enter address: ");
        String address = input.nextLine();

        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("HEIGHT: " + height);
        System.out.println("ADDRESS: " + address);

    }


}
