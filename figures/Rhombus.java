package com.vl.homework6.figures;

import com.vl.homework6.Point;
import com.vl.homework6.ShapeUtils;

public class Rhombus extends Figure implements Diagonalizable {
    private Point upperCorner;
    private Point rightCorner;
    private Point lowerCorner;
    private Point leftCorner;

    public Rhombus(String name, Point upperCorner, Point rightCorner, Point lowerCorner, Point leftCorner) {
        super(name);
        this.upperCorner = upperCorner;
        this.rightCorner = rightCorner;
        this.lowerCorner = lowerCorner;
        this.leftCorner = leftCorner;
    }

    @Override
    public double getArea() {
        return 0.5 * (ShapeUtils.getDistance(upperCorner, lowerCorner)) * (ShapeUtils.getDistance(leftCorner, rightCorner));
    }

    @Override
    public double getDiagonal() {
       return ShapeUtils.getDistance(upperCorner, lowerCorner);
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "upperCorner=" + upperCorner +
                ", rightCorner=" + rightCorner +
                ", lowerCorner=" + lowerCorner +
                ", leftCorner=" + leftCorner +
                '}';
    }
}
