package plays;

import playstests.*;

public class PlaysTests {

    public static void main(String [] args) {

        boolean ok = true;

        OrchestratorTests tester = new OrchestratorTests();
        ok = ok && tester.testPlay();

        System.out.println(ok ? "All tests passed" : "At least one failed");

    }
    
}
