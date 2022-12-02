package org.example;

import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Constructor;
import java.util.*;

abstract class Vectors implements VectorImpl {
    protected double[] coordinates;


    protected double[] sum(double[] first, double[] second) {
        double[] result = new double[second.length];
        for (int i = 0; i < second.length; i++) {
            result[i] = first[i] + second[i];
        }
        return result;
    }

    protected double[] sub(double[] first, double[] second) {
        double[] result = new double[second.length];
        for (int i = 0; i < second.length; i++) {
            second[i] *= -1;
        }
        return sum(first, second);
    }

    protected double product(double[] first, double[] second) {
        double result = 0;
        for (int i = 0; i < first.length; i++) {
            result += first[i] * second[i];
        }
        return result;
    }

    protected String vectorToString() {
        return "{" + Integer.toString(coordinates.length) + "}" + Arrays.toString(coordinates);
    }
}