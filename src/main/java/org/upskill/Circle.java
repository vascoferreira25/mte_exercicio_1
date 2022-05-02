package org.upskill;
import org.upskill.Point;

public class Circle extends Figure {
    private Point points;
    private double radius;

    public Circle (Point points, double radius) {
        this.points = points;
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * ( Math.PI * this.radius );
    }

    public Point getPoints() {
        return points;
    }

    public void setPoints(Point points) {
        this.points = points;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "point=" + points +
                ", radius=" + radius +
                '}';
    }
}
