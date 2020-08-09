package com.vl.homework6.figures;

import com.vl.homework6.Point;

public class Sphere extends Circle implements Volumeable{

    public Sphere(String name, Point centerOfCircle, int radius) {
        super(name, centerOfCircle, radius);
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(this.getRadius(), 3);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(this.getRadius(), 2);
    }
}
