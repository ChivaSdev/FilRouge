package firstgames;

import java.util.ArrayList;
import java.util.Arrays;

// Import class Scanner 
import java.util.Scanner;

public class TicTacToeMain {

    public static void main (String [] args) {

        // Instance of Scanner 
        Scanner scanner = new Scanner(System.in);

        // Asking names of the 2 players 
        System.out.println("Name of the 1st player : ");
        Player player1 = new Player(scanner.next());
        System.out.println("Name of the 2nd player : ");
        Player player2 = new Player(scanner.next());

        // Game initialisation
        TicTacToe game = new TicTacToe(player1, player2);
        
        System.out.println("Ready ?");

        // Game launching 
        while (game.isOver() == false) {
            System.out.println(game.situationToString());
            System.out.println(game.getCurrentPlayer().getName() + " 's turn");
            System.out.println("Valid moves : " + System.lineSeparator());
            ArrayList<Integer> validMovesList = game.validMoves();
            for (int i=0; i<validMovesList.size(); i++) {
                System.out.println(game.moveToString(validMovesList.get(i)));
            }
            System.out.println("Your choice : ");
            int playerChoice = scanner.nextInt();
            if (game.isValid(playerChoice) == true) {
                game.execute(playerChoice);
            } else {
                System.out.println("This move isn't in the list ! Try again !");
                playerChoice = scanner.nextInt();
                game.execute(playerChoice);
            }           
            game.isOver();
        }

        System.out.println(game.getWinner().getName() + " has won !");
        System.out.println(game.situationToString());

        scanner.close();
    }
}