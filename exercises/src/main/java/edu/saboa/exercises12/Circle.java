package edu.saboa.exercises12;
import edu.saboa.exercises09.Matrix;
import edu.saboa.exercises09.MathUtil;
import edu.saboa.exercises13.InvalidRadiusException;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {}


    public Circle(double radius) {
        // super();
        this.radius = radius;
    }

    public Circle(double x, double y, boolean filled) {
        this(Matrix.makePoint2D(x, y), filled);
        //this.filled = filled;
        //setPos(Matrix.makePoint2D(x,y));
    }

    public Circle(Matrix pos, boolean filled) {
        super(pos, filled);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        throws InvalidRadiusException {
            if (radius >= 0) {
                this.radius = radius;
            } else {
                throw new InvalidRadiusException("Bad radius: " + radius);
            }
        }
    }

    @Override
    public String toString() {
        String s = "Circle (r=" + radius + ") ";
        s += "which is also a " + super.toString();
        return s;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle otherCircle) {
            return (MathUtil.isDoubleEqual(radius, otherCircle.radius) && super.equals(otherCircle));
        }
        else {
            return false;
        }

    }
}
