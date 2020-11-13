package secondgames;

import java.util.Scanner;

public class GameMain {

    /**
     * Builds all the instances that we need to play a game
     * @param args
     */
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey ! You want to play some games ?");

        System.out.println("Let's choose one of the game down below : ");
        System.out.println("Nim Game : 1 (2 players required)");
        System.out.println("Tic Tac Toe : 2 (2 players required)");
        System.out.println("Tic Tac Toe with Hints : 3 (2 players required)");

        int playerChoice = scanner.nextInt();

        System.out.println("Name of the first player : ");
        Player player1 = new Player(scanner.next());
        System.out.println("Name of the second player : ");
        Player player2 = new Player(scanner.next());

        if (playerChoice == 1) {
            System.out.println("What's the initial size of matches : ");
            int initSizeMatches = scanner.nextInt();
            System.out.println("What's the maximum matches that you can grab ? : ");
            int maxNbMatches = scanner.nextInt();

            AbstractGame game = new Nim(initSizeMatches, maxNbMatches, player1, player2);
            Orchestrator launcher = new Orchestrator(game);
            launcher.playGame(game);
            
        } else if (playerChoice == 2) {
            AbstractGame game = new TicTacToe(player1, player2);
            Orchestrator launcher = new Orchestrator(game);
            launcher.playGame(game);
        } else {
            System.out.print("Not available yet !");
        }
    }
    
}
