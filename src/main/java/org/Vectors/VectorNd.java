package org.Vectors;

/**
 * Класс вектора длины N
 */
public class VectorNd extends Vectors<VectorNd> {
    public VectorNd(double... points) {
        coordinates = new double[points.length];
        System.arraycopy(points, 0, coordinates, 0, points.length);
    }
    /*
    Методы для сложения, вычитания, сравнения, скалярного произведения векторов длины N
    также проверяется чтобы длина векторов была одинаковая
     */
    public VectorNd sumVectors(VectorNd secondVector){
        checkSizes(secondVector);
        return new VectorNd(sum(this.getCoordinates(), secondVector.getCoordinates()));
    }

    public double productVectors(VectorNd secondVector) {
        checkSizes(secondVector);
        return product(this.getCoordinates(), secondVector.getCoordinates());
    }

    public VectorNd subVectors(VectorNd secondVector) {
        checkSizes(secondVector);
        return new VectorNd(sub(this.getCoordinates(), secondVector.getCoordinates()));
    }
    public int compareVectors(VectorNd secondVector) {
        checkSizes(secondVector);
        return compare(this.getCoordinates(), secondVector.getCoordinates());
    }

    /**
     * Метод для проверки одинаковой длины векторов
     * @param secondVector второй вектор
     */
    private void checkSizes(VectorNd secondVector){
        if (this.getCoordinates().length != secondVector.getCoordinates().length) throw new IllegalArgumentException("Разный размер векторов");
    }
}
