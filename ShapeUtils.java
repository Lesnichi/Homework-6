package com.vl.homework6;

import com.vl.homework6.figures.Figure;
import com.vl.homework6.figures.Rectangle;
import com.vl.homework6.figures.Triangle;

public class ShapeUtils {

    public static boolean isRectangle(Figure figure) {
        return figure.getClass() == Rectangle.class;
    }

    public static boolean isTriangle(Figure figure) {
        return figure.getClass() == Triangle.class;

    }

    public static double getDistance(Point point1, Point point2) {
        return (Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2)
                + Math.pow((point1.getY() - point2.getY()), 2)));
    }

    static boolean isCompare(Figure figure1, Figure figure2) {
        return figure1.getArea() == figure2.getArea();
    }

}
