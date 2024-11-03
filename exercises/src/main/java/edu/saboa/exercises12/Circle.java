package edu.saboa.exercises12;
import edu.saboa.exercises09.Matrix;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double x, double y, boolean filled) {
        setFilled(filled);
        setPos(Matrix.makePoint2D(x,y));
    }
}
