package edu.saboa.assign03;

import java.util.*;

public class GreetingCard {
    public GreetingCard(String [] lines, char boundaryChar) {
        //TODO
    }

    public char getBoundaryChar() {
        //TODO
    }

    public String getLines() {
        //TODO
    }

    public void setBoundaryChar(char boundaryChar) {
        //TODO
    }

    public void setLines(String [] lines) {
        //TODO
    }

    public String generateBoundaryLine() {
        StringBuilder boundaryLine = new StringBuilder();
        for(int i = 0; i < 50; i++) {
            boundaryLine.append(boundaryChar);
        }
        boundaryLine.append("\n");
        return boundaryLine.toString();
    }

    public String generateCenteredLine(String text) {
        //TODO
    }

    public String toString() {
        //TODO
    }
}
