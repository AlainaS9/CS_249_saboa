package edu.saboa.exercises12;

import java.util.*;

public class SystemInputSingleton {
    private static SystemInputSingleton instance = new SystemInputSingleton();

    public static SystemInputSingleton getInstance() {
        return instance;
    }

    private Scanner input = new Scanner(System.in);

    private SystemInputSingleton() {}

    public Scanner getScanner() {
        return input;
    }
}
