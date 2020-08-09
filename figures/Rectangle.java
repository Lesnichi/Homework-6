package com.vl.homework6.figures;

import com.vl.homework6.Point;
import com.vl.homework6.ShapeUtils;

public class Rectangle extends Figure implements Diagonalizable {
    private Point leftUpperCorner;
    private Point rightLowerCorner;

    public Rectangle(String name, Point leftUpperCorner, Point rightLowerCorner) {
        super(name);
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    @Override
    public double getDiagonal() {
        return ShapeUtils.getDistance(leftUpperCorner, rightLowerCorner);
    }

    @Override
    public double getArea() {
        return ((rightLowerCorner.getX() - leftUpperCorner.getX())
                * (leftUpperCorner.getY() - rightLowerCorner.getY()));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftUpperCorner=" + leftUpperCorner +
                ", rightLowerCorner=" + rightLowerCorner +
                '}';
    }
}
