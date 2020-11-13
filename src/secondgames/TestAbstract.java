package secondgames;

import secondgamestests.*;

public class TestAbstract {
    
    public static void main(String [] args) {
        
        boolean ok = true;

        AbstractGameTests abstractGameTester = new AbstractGameTests();
        ok = ok && abstractGameTester.testGetCurrentPlayer();
        ok = ok && abstractGameTester.testExecute();

        NimTests nimTester = new NimTests();
        ok = ok && nimTester.testGetCurrentPlayer();
        ok = ok && nimTester.testExecute();
        ok = ok && nimTester.testIsValid();
        ok = ok && nimTester.testIsOver();
        ok = ok && nimTester.testGetWinner();

        TicTacToeTests ticTacToeTester = new TicTacToeTests();
        ok = ok && ticTacToeTester.testGetCurrentPlayer();
        ok = ok && ticTacToeTester.testExecute();
        ok = ok && ticTacToeTester.testValidMoves();
        ok = ok && ticTacToeTester.testWins();
        ok = ok && ticTacToeTester.testIsOver();
        ok = ok && ticTacToeTester.testGetWinner();

        System.out.println(ok ? "All tests passed" : "At least one test failed");
    }


    
}
