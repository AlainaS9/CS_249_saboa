package edu.saboa.assign03;

import java.util.*;

public class GreetingCard {
    char boundaryChar;

    public GreetingCard(String [] lines, char boundaryChar) {

        setLines(lines);
        setBoundaryChar(boundaryChar);
    }

    public char getBoundaryChar() {

        return boundaryChar;
    }

    public String getLines() {
        String concatLines = new String();


    }

    public void setBoundaryChar(char boundaryChar) {
        this.boundaryChar = boundaryChar;
    }

    public void setLines(String [] lines) {
        String [] newLines = new String [lines.length];

        for(int i = 0; i < lines.length; i++) {
            newLines[i] = lines[i];
        }

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
