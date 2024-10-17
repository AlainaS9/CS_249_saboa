package edu.saboa.assign03;

public class GreetingCard {
    private char boundaryChar;
    private String [] thisLines;

    public GreetingCard(String [] lines, char boundaryChar) {

        setLines(lines);
        setBoundaryChar(boundaryChar);
    }

    public char getBoundaryChar() {

        return boundaryChar;
    }

    public String getLines() {
        StringBuilder LineBuilder = new StringBuilder();

        for(int i = 0; i < thisLines.length; i++) {
            LineBuilder.append(thisLines[i]);
        }

        return LineBuilder.toString();
    }

    public void setBoundaryChar(char boundaryChar) {
        this.boundaryChar = boundaryChar;
    }

    public void setLines(String [] lines) {
        thisLines = new String [lines.length];

        for(int i = 0; i < lines.length; i++) {
            thisLines[i] = lines[i] + "\n";
        }

    }

    public String generateBoundaryLine() {
        StringBuilder BoundaryLine = new StringBuilder();
        for(int i = 0; i < 50; i++) {
            BoundaryLine.append(boundaryChar);
        }
        BoundaryLine.append("\n");
        return BoundaryLine.toString();
    }

    public String generateCenteredLine(String text) {
        text = text.trim();
        //i hate that newline

        if(text.length() > 0){
            text = " " + text + " ";
        }

        String paddingString = "";
        int paddingNeeded;
        int firstHalf;
        int secondHalf;
        paddingNeeded = 50 - text.length();
        firstHalf = paddingNeeded / 2;
        secondHalf = paddingNeeded - firstHalf;

        for(int i = 0; i < firstHalf; i++) {
            paddingString += boundaryChar;
        }

        paddingString += text;

        for(int j = 0; j < secondHalf; j++) {
            paddingString += boundaryChar;
        }

        paddingString += "\n";

        return paddingString;
    }

    public String toString() {
        StringBuilder CardBuilder = new StringBuilder();
        int lineCount;
        int extraLines;
        int currentLine = 0;
        int linesLeft = thisLines.length;

        for (int j = 0; j < thisLines.length; j += 5) {
            if (!CardBuilder.isEmpty()) {
                CardBuilder.append("\n");
            }


            for (int i = 0; i < 2; i++) {
                CardBuilder.append(generateBoundaryLine());
            }

            if (linesLeft < 5) {
                lineCount = linesLeft;
                extraLines = 5 - lineCount;
            } else {
                lineCount = 5;
                extraLines = 0;
            }
            for (int i = 0; i < lineCount; i++) {
                CardBuilder.append(generateCenteredLine(thisLines[currentLine]));
                linesLeft--;
                currentLine++;
            }
            for (int i = 0; i < extraLines; i++) {
                CardBuilder.append(generateBoundaryLine());
            }

            for (int i = 0; i < 2; i++) {
                CardBuilder.append(generateBoundaryLine());
            }
        }

            return CardBuilder.toString();

    }
}
