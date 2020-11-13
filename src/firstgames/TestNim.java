package firstgames;

import firstgamestests.PlayerTests;
import firstgamestests.NimTests;

public class TestNim {

    public static void main (String [] args) {
        
        // Tests on Player
        boolean ok = true;
        PlayerTests playerTester = new PlayerTests();
        playerTester.testGetName();

        // Tests on Nim
        NimTests nimTester = new NimTests();
        ok = ok && nimTester.testGetInitialNbMatches();
        ok = ok && nimTester.testGetCurrentNbMatches();
        ok = ok && nimTester.testGetCurrentPlayer();
        ok = ok && nimTester.testRemoveMatches();
        ok = ok && nimTester.testIsValid();
        ok = ok && nimTester.testIsOver();
        ok = ok && nimTester.testGetWinner();

        System.out.println(ok ? "All tests passed" : "At least one test failed");
    
    }
}