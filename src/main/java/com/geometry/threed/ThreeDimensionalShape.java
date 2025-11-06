package com.geometry.threed;

public interface ThreeDimensionalShape {
    double calculateVolume();
    double calculateSurfaceArea();
    String getShapeType();

    default double calculateDensity(double mass) {
        if (mass <= 0) {
            throw new IllegalArgumentException("Mass must be positive");
        }
        return mass / calculateVolume();
    }
}
