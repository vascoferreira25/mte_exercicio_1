package org.upskill;
import org.upskill.Point;

public class Rectangle extends Figure{
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double area() {
        double width = Math.abs(upperLeft.getPointX())- bottomRight.getPointX();
        double height = Math.abs(upperLeft.getPointY())- bottomRight.getPointY();
        return width *height;
    }
}
