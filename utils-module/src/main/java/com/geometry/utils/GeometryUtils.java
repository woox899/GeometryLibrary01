package com.geometry.utils;
import com.geometry.shapes.Shape;

public class GeometryUtils {

    public static double convertSquareMetersToSquareFeet(double squareMeters) {
        return squareMeters * 10.764;
    }

    public static double convertSquareFeetToSquareMeters(double squareFeet) {
        return squareFeet / 10.764;
    }

    public static String compareShapes(Shape shape1, Shape shape2) {
        double area1 = shape1.calculateArea();
        double area2 = shape2.calculateArea();

        if (Math.abs(area1 - area2) < 0.001) {
            return "Shapes have equal area";
        } else if (area1 > area2) {
            return "First shape has larger area";
        } else {
            return "Second shape has larger area";
        }
    }

    public static double calculateTotalArea(Shape... shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculateArea();
        }
        return total;
    }
}
