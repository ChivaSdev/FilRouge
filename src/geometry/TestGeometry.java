package geometry;

import geometrytests.PointTests;
import geometrytests.SegmentTests;

public class TestGeometry {

    public static void main (String [] args) {

        // Tests on Point
        boolean ok = true;
        PointTests pointTester = new PointTests();
        ok = ok && pointTester.testGetX();
        ok = ok && pointTester.testGetY();
        ok = ok && pointTester.testSymmetricX();
        ok = ok && pointTester.testTranslate();
        System.out.println(ok ? "All tests passed" : "At least one test failed");

        // Tests on Segment
        SegmentTests segmentTester = new SegmentTests();
        ok = ok && segmentTester.testLength();
        System.out.println(ok ? "All tests passed" : "At least one test failed");
    }
}