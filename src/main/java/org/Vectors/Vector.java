package org.Vectors;

import java.util.*;

/*
Абстрактный класс векторов
 */
abstract class Vectors<T extends Vectors<T>> implements VectorImpl<T> {
    /**
     * Массив координат
     */
    protected double[] coordinates;

    /**
     * Асбтрактный метод для сложения и вычитания векторов и возвращения нового вектора того же размера
     */

    public abstract T sumVectors(T secondVector);

    public abstract T subVectors(T secondVector);

    /**
     * Метод для получения координат вектора в виде массива
     * @return координаты вектора
     */
    public double[] getCoordinates() {
        return coordinates;
    }

    /**
     * Метод для сравнения по координатам вектора
     * @param first координаты первого веткора
     * @param second координаты второго веткора
     * @return 1 если первый больше, -1 если больше второй, 0 если равны
     */
    public int compare(double[] first, double[] second) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return Double.compare(first[i], second[i]);
            }
        }
        return 0;
    }

    /**
     * Метод для сложения координат веткоров
     * @param first координаты первого веткора
     * @param second координаты второго веткора
     * @return массив координат третьего вектора
     */
    public double[] sum(double[] first, double[] second) {
        double[] result = new double[second.length];
        for (int i = 0; i < second.length; i++) {
            result[i] = first[i] + second[i];
        }
        return result;
    }
    /**
     * Метод для вычитания координат веткоров
     * @param first координаты первого веткора
     * @param second координаты второго веткора
     * @return массив координат третьего вектора
     */
    public double[] sub(double[] first, double[] second) {
        double[] firstCoordinates = new double[second.length];
        double[] secondCoordinates = new double[second.length];
        for (int i = 0; i < secondCoordinates.length; i++) {
            firstCoordinates[i] = first[i];
            secondCoordinates[i] = second[i] * -1;
        }
        return sum(firstCoordinates, secondCoordinates);
    }

    /**
     * Метод для получения скалярного произведения
     * @param first координаты первого веткора
     * @param second координаты второго веткора
     * @return скаляр
     */
    public double product(double[] first, double[] second) {
        double result = 0;
        for (int i = 0; i < first.length; i++) {
            result += first[i] * second[i];
        }
        return result;
    }

    /**
     * Метод для получения строкового представления вектора
     */
    public String vectorToString() {
        return "{" + coordinates.length + "}" + Arrays.toString(coordinates);
    }
}