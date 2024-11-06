package edu.saboa.assign04;

public class GameBoard {
    private char charArray [][];
    private char fillChar;

    public GameBoard(int rowCnt, int colCnt, char fillChar) {
        charArray = new char [rowCnt][colCnt];
        this.fillChar = fillChar;

        for(int i  = 0; i < rowCnt; i++) {
            for(int j = 0; j < colCnt; j++) {
                charArray[i][j] = fillChar;
            }
        }

    }

    public void clear() {
        for(int i  = 0; i < charArray.length; i++) {
            for(int j = 0; j < charArray[0].length; j++) {
                charArray[i][j] = fillChar;
            }
        }
    }

    public int getRowCnt() {
        return charArray.length;
    }

    public int getColCnt() {
        return charArray[0].length;
    }

    public boolean isValidPosition(int row, int col) {
        if((row >= 0 && row < charArray.length) && (col >= 0 && col < charArray[0].length)) {
            return true;
        }
        else {
            return false;
        }

    }

    public char getPos(int row, int col) {
        if(isValidPosition(row, col)) {
          return charArray[row][col];
        }
        else {
            return ' ';
        }

    }

    public boolean setPos(int row, int col, char c) {
        if(isValidPosition(row, col)) {
            charArray[row][col] = c;
            return true;
        }
        else {
            return false;
        }


    }

    public String toString() {

        return charArray.length + " x " + charArray[0].length
               + " GameBoard (default: " + fillChar + ")";

    }

    public String getBoardString() {
        String board = "";
        for(int i  = 0; i < charArray.length; i++) {
            for(int j = 0; j < charArray[0].length; j++) {
                board += charArray[i][j];
            }
            board += "\n";
        }

        return board;

    }
}
