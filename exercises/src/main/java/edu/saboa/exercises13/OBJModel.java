package edu.saboa.exercises13;

import java.io.IOException;
import java.util.*;
import java.io.*;
import edu.saboa.exercises09.Matrix;

public class OBJModel {
    private ArrayList<Matrix> vertices = new ArrayList<>();
    private ArrayList<Integer> faces = new ArrayList<>();

    public void clear() {
        vertices.clear();
        faces.clear();
    }

    public void load(String filename)
            throws IOException {
        try(
                Scanner fileInput = new Scanner(new File (filename))
                ) {

        }
        catch(Exception e) {
            clear();
            throw new IOException("Bad file load", e);
        }
    }
}
