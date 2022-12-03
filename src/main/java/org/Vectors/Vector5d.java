package org.Vectors;

/**
 * Класс вектора длинны 5
 */
public class Vector5d extends Vectors<Vector5d> {
    public Vector5d(double z, double x, double c, double b, double q) {
        coordinates = new double[5];
        coordinates[0] = z;
        coordinates[1] = x;
        coordinates[2] = c;
        coordinates[3] = b;
        coordinates[4] = q;
    }
    public Vector5d(double[] coordinates) {
        this.coordinates = coordinates;
    }
    /*Методы для сложения, вычитания, сравнения, скалярного произведения векторов длины 5*/
    public Vector5d sumVectors(Vector5d v) {
        return new Vector5d(sum(this.getCoordinates(), v.getCoordinates()));
    }

    public double productVectors(Vector5d b) {
        return product(this.getCoordinates(), b.getCoordinates());
    }

    public Vector5d subVectors(Vector5d b) {
        return new Vector5d(sub(this.getCoordinates(), b.getCoordinates()));
    }
    public int compareVectors(Vector5d b) {
        return compare(this.getCoordinates(),b.getCoordinates());
    }
}
