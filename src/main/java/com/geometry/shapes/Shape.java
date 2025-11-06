package com.geometry.shapes;

public interface Shape {
    double calculatePerimeter();
    double calculateArea();
    default String getShapeInfo() {
        return String.format("Area: %.2f, Perimeter: %.2f",
                calculateArea(), calculatePerimeter());
    }
}
