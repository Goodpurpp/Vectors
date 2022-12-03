package org.Vectors;

public class VectorND extends Vectors<VectorND> {
    public VectorND(double... points) {
        coordinates = new double[points.length];
        System.arraycopy(points, 0, coordinates, 0, points.length);
    }

    public VectorND sumVectors(VectorND b){
        checkSizes(b);
        return new VectorND(sum(this.getCoordinates(), b.getCoordinates()));
    }

    public double productVectors(VectorND b) {
        checkSizes(b);
        return product(this.getCoordinates(), b.getCoordinates());
    }

    public VectorND subVectors(VectorND b) {
        checkSizes(b);
        return new VectorND(sub(this.getCoordinates(), b.getCoordinates()));
    }
    public int compareVectors(VectorND b) {
        checkSizes(b);
        return compare(this.getCoordinates(), b.getCoordinates());
    }

    private void checkSizes(VectorND a){
        if (this.getCoordinates() != a.getCoordinates()) throw new IllegalArgumentException("Разный размер векторов");
    }
}
