import org.Vectors.Vector5d;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestVector5d {
    @Test
    @DisplayName("1 test: compare vectors")
    void testCompareVectors() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d secondVector5d = new Vector5d(2, 3, 4,1,1);
        Assertions.assertEquals(firstVector5d.compareVectors(secondVector5d), -1);
    }

    @DisplayName("2 test: compare vectors")
    @Test
    void testCompareVectors2() {
        Vector5d secondVector5d = new Vector5d(2, 3, 4,1,1);
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Assertions.assertEquals(secondVector5d.compareVectors(firstVector5d), 1);
    }

    @DisplayName("3 test: compare vectors")
    @Test
    void testCompareVectors3() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Assertions.assertEquals(firstVector5d.compareVectors(firstVector5d), 0);
    }

    @DisplayName("4 test: add vectors")
    @Test
    void testAddVectors1() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d secondVector5d = new Vector5d(2, 3, 4,1,1);
        Vector5d thirdVector5d = new Vector5d(3, 5, 7,2,2);
        Vector5d fourhVector5d = secondVector5d.sumVectors(firstVector5d);
        Assertions.assertArrayEquals(thirdVector5d.getCoordinates(), fourhVector5d.getCoordinates());
    }

    @DisplayName("5 test: add vectors")
    @Test
    void testAddVectors2() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d secondVector5d = new Vector5d(2, 3, 4,1,1);
        Vector5d thirdVector5d = new Vector5d(3, 5, 7,2,2);
        Vector5d fourthVector5d = secondVector5d.sumVectors(firstVector5d);
        Assertions.assertArrayEquals(thirdVector5d.getCoordinates(), fourthVector5d.getCoordinates());
    }

    @DisplayName("6 test: add vectors")
    @Test
    void testAddVectors3() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,0,0);
        Vector5d secondVector5d = new Vector5d(2, 4, 6,0,0);
        Vector5d thirdVector5d = firstVector5d.sumVectors(firstVector5d);
        Assertions.assertArrayEquals(thirdVector5d.getCoordinates(), secondVector5d.getCoordinates());
    }

    @DisplayName("7 test: sub vectors")
    @Test
    void testSubVectors1() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d fivesVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d secondVector5d = new Vector5d(0, 0, 0,0,0);
        Vector5d thirdVector5d = firstVector5d.subVectors(fivesVector5d);
        Assertions.assertArrayEquals(thirdVector5d.getCoordinates(), secondVector5d.getCoordinates());
    }
    @DisplayName("8 test: sub vectors")
    @Test
    void testSubVectors2() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d secondVector5d = new Vector5d(0, 0, 0,0,0);
        Vector5d thirdVector5d = firstVector5d.subVectors(firstVector5d);
        Assertions.assertArrayEquals(thirdVector5d.getCoordinates(), secondVector5d.getCoordinates());
    }
    @DisplayName("9 test: product vectors")
    @Test
    void testProductVectors1() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,1,1);
        Vector5d secondVector5d = new Vector5d(0, 0, 0,0,0);
        double result= firstVector5d.productVectors(secondVector5d);
        Assertions.assertEquals(0, result);
    }
    @DisplayName("10 test: product vectors")
    @Test
    void testProductVectors2() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,0,0);
        double result= firstVector5d.productVectors(firstVector5d);
        Assertions.assertEquals(14, result);
    }
    @DisplayName("11 test: ToString vectors")
    @Test
    void testToStringVectors1() {
        Vector5d firstVector5d = new Vector5d(1, 2, 3,0,0);
        Assertions.assertEquals(firstVector5d.vectorToString(),"{5}[1.0, 2.0, 3.0, 0.0, 0.0]");
    }
    @DisplayName("12 test: ToString vectors")
    @Test
    void testToStringVectors2() {
        Vector5d firstVector5d = new Vector5d(2, 2, 8,0,0);
        Assertions.assertEquals(firstVector5d.vectorToString(),"{5}[2.0, 2.0, 8.0, 0.0, 0.0]");
    }
}