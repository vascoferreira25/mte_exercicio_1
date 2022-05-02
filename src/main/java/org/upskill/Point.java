package org.upskill;

public class Point {
    private double pointX;
    private double pointY;

    public Point (double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    // Para fins de ORM
    protected Point (){}

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }
}
