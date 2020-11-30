package players;

import playerstests.*;

import java.util.Scanner;

public class PlayersTests {

    public static void main(String[] args) {

        boolean ok = true;

        HumanTests humanTester = new HumanTests();
        ok = ok && humanTester.testChooseMove(); 
        
        RandomPlayerTests randomTester = new RandomPlayerTests();
        ok = ok && randomTester.testChooseMove();

        NegamaxPlayerTests negamaxTester = new NegamaxPlayerTests();
        ok = ok && negamaxTester.testEvaluate();
        ok = ok && negamaxTester.testChooseMove();

        System.out.println(ok ? "All tests passed" : "At least one failed");

    }
}    