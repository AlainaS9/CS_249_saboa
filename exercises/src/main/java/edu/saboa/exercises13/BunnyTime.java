package edu.saboa.exercises13;

public class BunnyTime {
    public static void main(String [] args) {
        OBJModel model = new OBJModel();
        try {
            model.load("bunny.obj");
            model.save("bunnyMod.obj");
        }
        catch(Exception e) {
            System.err.println("File error");
        }
    }
}
