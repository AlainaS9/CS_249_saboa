package edu.saboa.exercises13;

public class BunnyTime {
    public static void main(String [] args) {
        OBJModel model = new OBJModel();
        try {
            model.load("bunny.obj");
            Matrix S = Matrix.makeScaling3D(1.0, 2.0, 1.0);
            model.applyTransformation(S);
            model.save("bunnyMod.obj");
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
}
