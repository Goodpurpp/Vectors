package org.example;

import java.util.Vector;

public class Vector3d extends Vectors {
    private final double[] coordinates = new double[3];

    double[] getCoordinates() {
        return coordinates;
    }

    Vector3d(double z, double x, double c) {
        super(Vector3d.class,z,x,c);
    }
    public Vector3d add(Vectors v) {
        return (Vector3d) super.add(v);
    }
}
