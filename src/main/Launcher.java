package main;

import games.*;
import plays.*;
import players.*;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        Player player1;
        Player player2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's choose one of the game down below : ");
        System.out.println("Nim Game : 1 (2 players required)");
        System.out.println("Tic Tac Toe : 2 (2 players required)");
        System.out.println("Tic Tac Toe with Hints : 3 (2 players required)");

        int gameChoice = scanner.nextInt();

        System.out.println("Choose type of players : ");
        System.out.println("Player vs Player : 1");
        System.out.println("Player vs AI : 2");
        System.out.println("AI vs AI : 3");

        int playersChoice = scanner.nextInt();

        if (playersChoice == 1) {
            System.out.println("Name of the first player : ");
            player1 = new Human(scanner.next(), scanner);
            System.out.println("Name of the second player : ");
            player2 = new Human(scanner.next(), scanner);
        } else if (playersChoice == 2) {
            System.out.println("Name of the player : ");
            player1 = new Human(scanner.next(), scanner);
            player2 = new NegamaxPlayer();
        } else {
            player1 = new NegamaxPlayer();
            player2 = new NegamaxPlayer();
        }

        if (gameChoice == 1) {
            System.out.println("Let's play to Nim !");
            System.out.println("What's the initial size of matches : ");
            int initSizeMatches = scanner.nextInt();
            System.out.println("What's the maximum matches you can grab ? : ");
            int maxNbMatches = scanner.nextInt();
            Nim game = new Nim(initSizeMatches, maxNbMatches, player1, player2);
            Orchestrator launcher = new Orchestrator(game);
            launcher.play();
        } else if (gameChoice == 2) {
            TicTacToe game = new TicTacToe(player1, player2);
            Orchestrator launcher = new Orchestrator(game);
            launcher.play();
        } else {
            TicTacToeWithHints game = new TicTacToeWithHints(player1, player2);
            Orchestrator launcher = new Orchestrator(game);
            launcher.play();
        }
        scanner.close();
    }
}