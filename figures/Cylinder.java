package com.vl.homework6.figures;

import com.vl.homework6.Point;

public class Cylinder extends Circle implements Volumeable{
    private int height;

    public Cylinder(String name, Point centerOfCircle, int radius, int height) {
        super(name, centerOfCircle, radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", centerOfCircle=" + centerOfCircle +
                '}';
    }
}
