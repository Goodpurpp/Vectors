package org.Vectors;

public class Vector3d extends Vectors<Vector3d> {

    public Vector3d(double z, double x, double c) {
        coordinates = new double[3];
        coordinates[0] = z;
        coordinates[1] = x;
        coordinates[2] = c;
    }

    public Vector3d(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public Vector3d sumVectors(Vector3d v) {
        return new Vector3d(sum(this.getCoordinates(), v.getCoordinates()));
    }

    public double productVectors(Vector3d b) {
        return product(this.getCoordinates(), b.getCoordinates());
    }

    public Vector3d subVectors(Vector3d b) {
        return new Vector3d(sub(this.getCoordinates(), b.getCoordinates()));
    }

    public int compareVectors(Vector3d b) {
        return compare(this.getCoordinates(), b.getCoordinates());
    }

}
