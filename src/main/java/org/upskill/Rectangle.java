package org.upskill;

public class Rectangle extends Figure {
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double perimeter () {
        double width = Math.abs(upperLeft.getPointX() - bottomRight.getPointX());
        double height = Math.abs(upperLeft.getPointY() - bottomRight.getPointY());

        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
