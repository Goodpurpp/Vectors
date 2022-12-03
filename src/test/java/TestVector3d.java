import org.Vectors.Vector3d;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestVector3d {
    @Test
    @DisplayName("1 test: compare vectors")
    void testCompareVectors() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(2, 3, 4);
        Assertions.assertEquals(firstVector3d.compareVectors(secondVector3d), -1);
    }

    @DisplayName("2 test: compare vectors")
    @Test
    void testCompareVectors2() {
        Vector3d secondVector3d = new Vector3d(2, 3, 4);
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Assertions.assertEquals(secondVector3d.compareVectors(firstVector3d), 1);
    }

    @DisplayName("3 test: compare vectors")
    @Test
    void testCompareVectors3() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Assertions.assertEquals(firstVector3d.compareVectors(firstVector3d), 0);
    }

    @DisplayName("4 test: add vectors")
    @Test
    void testAddVectors1() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(2, 3, 4);
        Vector3d thirdVector3d = new Vector3d(3, 5, 7);
        Vector3d fourhVector3d = secondVector3d.sumVectors(firstVector3d);
        Assertions.assertArrayEquals(thirdVector3d.getCoordinates(), fourhVector3d.getCoordinates());
    }

    @DisplayName("5 test: add vectors")
    @Test
    void testAddVectors2() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(2, 3, 4);
        Vector3d thirdVector3d = new Vector3d(3, 5, 7);
        Vector3d fourthVector3d = secondVector3d.sumVectors(firstVector3d);
        Assertions.assertArrayEquals(thirdVector3d.getCoordinates(), fourthVector3d.getCoordinates());
    }

    @DisplayName("6 test: add vectors")
    @Test
    void testAddVectors3() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(2, 4, 6);
        Vector3d thirdVector3d = firstVector3d.sumVectors(firstVector3d);
        Assertions.assertArrayEquals(thirdVector3d.getCoordinates(), secondVector3d.getCoordinates());
    }

    @DisplayName("7 test: sub vectors")
    @Test
    void testSubVectors1() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d fivesVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(0, 0, 0);
        Vector3d thirdVector3d = firstVector3d.subVectors(fivesVector3d);
        Assertions.assertArrayEquals(thirdVector3d.getCoordinates(), secondVector3d.getCoordinates());
    }
    @DisplayName("8 test: sub vectors")
    @Test
    void testSubVectors2() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(0, 0, 0);
        Vector3d thirdVector3d = firstVector3d.subVectors(firstVector3d);
        Assertions.assertArrayEquals(thirdVector3d.getCoordinates(), secondVector3d.getCoordinates());
    }
    @DisplayName("9 test: product vectors")
    @Test
    void testProductVectors1() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Vector3d secondVector3d = new Vector3d(0, 0, 0);
        double result= firstVector3d.productVectors(secondVector3d);
        Assertions.assertEquals(0, result);
    }
    @DisplayName("10 test: product vectors")
    @Test
    void testProductVectors2() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        double result= firstVector3d.productVectors(firstVector3d);
        Assertions.assertEquals(14, result);
    }
    @DisplayName("11 test: ToString vectors")
    @Test
    void testToStringVectors1() {
        Vector3d firstVector3d = new Vector3d(1, 2, 3);
        Assertions.assertEquals(firstVector3d.vectorToString(),"{3}[1.0, 2.0, 3.0]");
    }
    @DisplayName("12 test: ToString vectors")
    @Test
    void testToStringVectors2() {
        Vector3d firstVector3d = new Vector3d(2, 2, 8);
        Assertions.assertEquals(firstVector3d.vectorToString(),"{3}[2.0, 2.0, 8.0]");
    }
}
