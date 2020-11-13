package plays;

import java.util.Random;
import java.util.Scanner;
import players.*;
import games.*;

public class TestOrchestrator {

    public static void main(String [] args) {

        // Tests pour 2 joueurs humains : 

        /* Scanner scanner= new Scanner(System.in);
        Player player1 = new Human("Moi", scanner);
        Player player2 = new Human("Toi", scanner);
        TicTacToe game = new TicTacToe(player1, player2);
        Orchestrator orchestrator = new Orchestrator(game);
        orchestrator.play();
        scanner.close();
        */

        // Test entre joueurs humains et aléatoire

        Scanner scanner = new Scanner(System.in);
        Player player1 = new RandomPlayer();
        Player player2 = new Human("Moi", scanner);
        TicTacToe game = new TicTacToe(player1, player2);
        Orchestrator orchestrator = new Orchestrator(game);
        orchestrator.play();
        scanner.close();
    }


    
}