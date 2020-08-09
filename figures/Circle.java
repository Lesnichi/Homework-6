package com.vl.homework6.figures;

import com.vl.homework6.Point;

public class Circle extends Figure {
    Point centerOfCircle;
    private int radius;

    public Circle(String name, Point centerOfCircle, int radius) {
        super(name);
        this.centerOfCircle = centerOfCircle;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerOfCircle=" + centerOfCircle +
                ", radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }
}
