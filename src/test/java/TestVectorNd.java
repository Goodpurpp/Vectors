import org.Vectors.VectorNd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestVectorNd {
    @Test
    @DisplayName("1 test: compare vectors")
    void testCompareVectors() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertEquals(firstVectorNd.compareVectors(secondVectorNd), -1);
    }

    @DisplayName("2 test: compare vectors")
    @Test
    void testCompareVectors2() {
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        Assertions.assertEquals(secondVectorNd.compareVectors(firstVectorNd), 1);
    }

    @DisplayName("3 test: compare vectors")
    @Test
    void testCompareVectors3() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        Assertions.assertEquals(firstVectorNd.compareVectors(firstVectorNd), 0);
    }

    @DisplayName("4 test: add vectors")
    @Test
    void testAddVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        VectorNd thirdVectorNd = new VectorNd(3, 5, 7, 2, 2);
        VectorNd fourhVectorNd = secondVectorNd.sumVectors(firstVectorNd);
        Assertions.assertArrayEquals(thirdVectorNd.getCoordinates(), fourhVectorNd.getCoordinates());
    }

    @DisplayName("5 test: add vectors")
    @Test
    void testAddVectors2() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        VectorNd thirdVectorNd = new VectorNd(3, 5, 7, 2, 2);
        VectorNd fourthVectorNd = secondVectorNd.sumVectors(firstVectorNd);
        Assertions.assertArrayEquals(thirdVectorNd.getCoordinates(), fourthVectorNd.getCoordinates());
    }

    @DisplayName("6 test: add vectors")
    @Test
    void testAddVectors3() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 0, 0);
        VectorNd secondVectorNd = new VectorNd(2, 4, 6, 0, 0);
        VectorNd thirdVectorNd = firstVectorNd.sumVectors(firstVectorNd);
        Assertions.assertArrayEquals(thirdVectorNd.getCoordinates(), secondVectorNd.getCoordinates());
    }

    @DisplayName("7 test: sub vectors")
    @Test
    void testSubVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd fivesVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd secondVectorNd = new VectorNd(0, 0, 0, 0, 0);
        VectorNd thirdVectorNd = firstVectorNd.subVectors(fivesVectorNd);
        Assertions.assertArrayEquals(thirdVectorNd.getCoordinates(), secondVectorNd.getCoordinates());
    }

    @DisplayName("8 test: sub vectors")
    @Test
    void testSubVectors2() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd secondVectorNd = new VectorNd(0, 0, 0, 0, 0);
        VectorNd thirdVectorNd = firstVectorNd.subVectors(firstVectorNd);
        Assertions.assertArrayEquals(thirdVectorNd.getCoordinates(), secondVectorNd.getCoordinates());
    }

    @DisplayName("9 test: product vectors")
    @Test
    void testProductVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1);
        VectorNd secondVectorNd = new VectorNd(0, 0, 0, 0, 0);
        double result = firstVectorNd.productVectors(secondVectorNd);
        Assertions.assertEquals(0, result);
    }

    @DisplayName("10 test: product vectors")
    @Test
    void testProductVectors2() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 0, 0);
        double result = firstVectorNd.productVectors(firstVectorNd);
        Assertions.assertEquals(14, result);
    }

    @DisplayName("11 test: ToString vectors")
    @Test
    void testToStringVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 0, 0);
        Assertions.assertEquals(firstVectorNd.vectorToString(), "{5}[1.0, 2.0, 3.0, 0.0, 0.0]");
    }

    @DisplayName("12 test: ToString vectors")
    @Test
    void testToStringVectors2() {
        VectorNd firstVectorNd = new VectorNd(2, 2, 8, 0, 0);
        Assertions.assertEquals(firstVectorNd.vectorToString(), "{5}[2.0, 2.0, 8.0, 0.0, 0.0]");
    }

    @Test
    @DisplayName("13 test: compare not equals vectors")
    void testCompareNotEqualsVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1, 0);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->firstVectorNd.compareVectors(secondVectorNd));
    }
    @Test
    @DisplayName("14 test: compare not equals vectors")
    void testCompareNotEqualsVectors2() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3, 1, 1, 0);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->secondVectorNd.compareVectors(firstVectorNd));
    }
    @DisplayName("15 test: add not equals vectors")
    @Test
    void testAddNotEqualsVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->secondVectorNd.sumVectors(firstVectorNd));
    }
    @DisplayName("16 test: add not equals vectors")
    @Test
    void testAddNotEqualsVectors2() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->firstVectorNd.sumVectors(secondVectorNd));
    }
    @DisplayName("17 test: sub not equals vectors")
    @Test
    void testSubNotEqualsVectors1() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->firstVectorNd.subVectors(secondVectorNd));
    }
    @DisplayName("17 test: sub not equals vectors")
    @Test
    void testSubNotEqualsVectors2() {
        VectorNd firstVectorNd = new VectorNd(1, 2, 3);
        VectorNd secondVectorNd = new VectorNd(2, 3, 4, 1, 1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->secondVectorNd.subVectors(firstVectorNd));
    }
}