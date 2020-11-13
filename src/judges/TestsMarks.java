package judges;

import judgestests.MarksTests;

public class TestsMarks {

    public static void main (String [] args) {

        boolean ok = true;
        MarksTests marksTester = new MarksTests();
        ok = ok && marksTester.testGetMarkSetMark();
        ok = ok && marksTester.testAverage();
        ok = ok && marksTester.testGlobalAverage();
        System.out.println(ok ? "All tests passed" : "At least one test failed");
        
    } 
}