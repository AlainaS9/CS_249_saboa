package edu.saboa.assign04;

public class Box {
    int startRow;
    int startCol;
    int endRow;
    int endCol;
    boolean filled;
    char drawChar;

    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar) {
        startRow = sr;
        startCol = sc;
        endRow = er;
        endCol = ec;
        this.filled = filled;
        this.drawChar = drawChar;

    }

    public String toString() {
        if(filled) {
            return "Filled Box from (" + startRow + "," + startCol + ") to ("
                    + endRow + "," + endCol + ") with char '" + drawChar + "'";
        }
        else {
            return "Box from (" + startRow + "," + startCol + ") to (" +
                    endRow + "," + endCol + ") with char '" + drawChar + "'";
        }

    }

    public void draw(GameBoard s) {
        if(filled) {
            for(int i = startRow; i <= endRow; i++) {
                for(int j = startCol; j <= endCol; j++) {
                    s.setPos(i, j, drawChar);
                }
            }
        }
        else {
            for(int i = startRow; i <= endRow; i++) {
                s.setPos(i, startCol, drawChar);
                s.setPos(i, endCol, drawChar);
            }
            for(int i = startCol; i <= endCol; i++) {
                s.setPos(startRow, i, drawChar);
                s.setPos(endRow, i, drawChar);
            }
        }

    }

}
