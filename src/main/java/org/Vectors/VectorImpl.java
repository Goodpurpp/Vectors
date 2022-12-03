package org.Vectors;

/**
 * Интерфейс для базовых операций у векторов
 */
public interface VectorImpl<T> {
    T sumVectors(T b);

    T subVectors(T b);

    int compare(double[] a, double[] b);

    double productVectors(T b);
}
