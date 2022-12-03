package org.Vectors;

public interface VectorImpl<T> {
    T sumVectors(T b);

    T subVectors(T b);

    int compare(double[] a, double[] b);

    double productVectors(T b);
}
