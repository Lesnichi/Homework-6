package com.vl.homework6.figures;

import com.vl.homework6.Point;
import com.vl.homework6.ShapeUtils;

public class Triangle extends Figure {

    private Point corner1;
    private Point corner2;
    private Point corner3;

    public Triangle(String name, Point corner1, Point corner2, Point corner3) {
        super(name);
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.corner3 = corner3;
    }

    @Override
    public double getArea() {
        double ab = ShapeUtils.getDistance(corner1, corner2);
        double bc = ShapeUtils.getDistance(corner2, corner3);
        double ac = ShapeUtils.getDistance(corner3, corner1);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
}
