package edu.saboa.exercises07;

import java.util.*;

public class SemesterProgram {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int studentCnt = input.nextInt();

        for(int i = 0; i < studentCnt; i++){
            double r = Math.random(); // [0,1)
            // [50,100]
            // 51 different grades
            int score = 50 + (int)(51*r);
            String letter = GradingUtil.getGradeLetter(score);
            System.out.println("Student " + (i + 1) + ": " + score + "(" + letter + ")");
        }
    }
}
