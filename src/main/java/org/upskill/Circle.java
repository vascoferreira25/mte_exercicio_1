package org.upskill;

public class Circle {
    private Point points;
    private double radius;

    public Circle (Point points, double radius) {
        this.points = points;
        this.radius = radius;
    }

    public Circle() {
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
