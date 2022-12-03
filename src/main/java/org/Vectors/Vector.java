package org.Vectors;

import java.util.*;

abstract class Vectors<T extends Vectors<T>> implements VectorImpl<T> {
    protected double[] coordinates;

    public abstract T sumVectors(T v);

    public abstract T subVectors(T b);

    public double[] getCoordinates() {
        return coordinates;
    }

    public int compare(double[] first, double[] second) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return Double.compare(first[i], second[i]);
            }
        }
        return 0;
    }


    public double[] sum(double[] first, double[] second) {
        double[] result = new double[second.length];
        for (int i = 0; i < second.length; i++) {
            result[i] = first[i] + second[i];
        }
        return result;
    }

    public double[] sub(double[] first, double[] second) {
        double[] firstCoordinates = new double[second.length];
        double[] secondCoordinates = new double[second.length];
        for (int i = 0; i < secondCoordinates.length; i++) {
            firstCoordinates[i] = first[i];
            secondCoordinates[i] = second[i] * -1;
        }
        return sum(firstCoordinates, secondCoordinates);
    }

    public double product(double[] first, double[] second) {
        double result = 0;
        for (int i = 0; i < first.length; i++) {
            result += first[i] * second[i];
        }
        return result;
    }

    public String vectorToString() {
        return "{" + Integer.toString(coordinates.length) + "}" + Arrays.toString(coordinates);
    }
}