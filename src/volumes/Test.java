package volumes;

import volumestests.ParallelepipedTests;
import volumestests.CylinderTests;
import volumestests.PrismTests;
import volumestests.CubeTests;

public class Test {
    
    public static void main(String [] args) {  

    boolean ok = true;

    ParallelepipedTests parallelepipedTester = new ParallelepipedTests();
    ok = ok && parallelepipedTester.testGetHeight();
    ok = ok && parallelepipedTester.testGetLength();
    ok = ok && parallelepipedTester.testGetWidth();
    ok = ok && parallelepipedTester.testBasisSurface();
    ok = ok && parallelepipedTester.testVolume(); 

    CylinderTests cylinderTester = new CylinderTests();
    ok = ok && cylinderTester.testGetHeight();    
    ok = ok && cylinderTester.testGetRadius();
    ok = ok && cylinderTester.testBasisSurface();
    ok = ok && cylinderTester.testVolume();

    PrismTests prismTester = new PrismTests();
    ok = ok && prismTester.testGetHeight();
    ok = ok && prismTester.testGetBasisHeight();
    ok = ok && prismTester.testGetBasisLength();
    ok = ok && prismTester.testBasisSurface();
    ok = ok && prismTester.testVolume();

    CubeTests cubeTester = new CubeTests();
    ok = ok && cubeTester.testGetHeight();
    ok = ok && cubeTester.testGetLength();
    ok = ok && cubeTester.testGetWidth();
    ok = ok && cubeTester.testGetEdgeSize();
    ok = ok && cubeTester.testBasisSurface();
    ok = ok && cubeTester.testVolume();

    System.out.println(ok ? "All tests passed" : "At least one failed");

    }
}