package com.geomerty.threed;

public class Cube implements ThreeDimensionalShape {
    private double side;

    public Cube(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public String getShapeType() {
        return "Cube";
    }

    public double getSide() {
        return side;
    }
}