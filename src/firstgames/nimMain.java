package firstgames;

// Import class Scanner from java.util 
import java.util.Scanner;

public class nimMain {

    public static void main (String [] args) {
        // Instance of Scanner 
        Scanner scanner = new Scanner(System.in);
        
        // Asking names of the 2 players
        System.out.println("Write the name of the 1st player : ");
        String namePlayer1 = scanner.next();
        Player player1 = new Player(namePlayer1);
        System.out.println("Write the name of the 2nd player : ");
        String namePlayer2 = scanner.next();
        Player player2 = new Player(namePlayer2);

        // Asking for the initial size of matches 
        System.out.println("What's the initial size of matches : ");
        int initSizeMatches = scanner.nextInt();

        // Asking for the maximum number of matches that a player can grab 
        System.out.println("What's the maximum matches that you can grab ? : ");
        int maxNbMatches = scanner.nextInt();

        // Game launching
        Nim game = new Nim(initSizeMatches, maxNbMatches, player1, player2);
        
        System.out.println("Ready ?");

        while (game.isOver() == false) {
            System.out.println(game.getCurrentPlayer().getName() + ", How many matches do you want to take ? it can't be more than " + maxNbMatches);
            int nbMatchesToRemoved = scanner.nextInt();
            if (game.isValid(nbMatchesToRemoved) == true) {
                game.removeMatches(nbMatchesToRemoved);
            } else {
                System.out.println("You can't remove more matches than " + maxNbMatches);
                nbMatchesToRemoved = scanner.nextInt();
                game.removeMatches(nbMatchesToRemoved);
            }
            game.situationToString();
            System.out.println(game.situationToString());
            game.isOver();
            System.out.println(game.getCurrentPlayer().getName() + " 's turn");
        }

        // End of the game ! 
        System.out.print("Game is over ! " + game.getWinner().getName());
        scanner.close();
    }
}