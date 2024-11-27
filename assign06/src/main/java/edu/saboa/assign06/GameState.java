package edu.saboa.assign06;

import edu.saboa.assign04.GameBoard;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable {
    ArrayList<Loadable> loadableList = new ArrayList<>();
    GameBoard baseMap = new GameBoard(12, 30, '.');

    public Loadable createLoadable(String typeName) throws GameFileException {
        return switch (typeName) {
            case "Skeleton" -> new Skeleton();
            case "Rat" -> new Rat();
            case "Item" -> new Item();
            case "Tome" -> new Tome();
            default -> throw new GameFileException("Unknown type: " + typeName);
        };
    }

    public void load(Scanner input) throws GameFileException {
        baseMap.clear();
        loadableList.clear();
        int numLines = input.nextInt();

        for(int i = 0; i < numLines; i++) {
            String typeName = input.next();
            Loadable m = createLoadable(typeName);
            m.load(input);
            loadableList.add(m);
            if(m instanceof Drawable) {
                ((Drawable)m).draw(baseMap);
            }
        }
    }

    public String toString() {
        String gameString = "";
        gameString = "MAP:\n" + baseMap.getBoardString() + "\nCREATURES:\n";
        for (Loadable loadable : loadableList) {
            if(loadable instanceof Creature) {
                gameString += "* " + loadable + "\n";
            }
        }
        gameString += "INVENTORY:\n";
        for (Loadable loadable : loadableList) {
            if(loadable instanceof Item) {
                gameString += "* " + loadable + "\n";
            }
        }
        return gameString;
    }

    public void save(String filename) throws GameFileException {
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this.toString());
            writer.close();
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }


}
