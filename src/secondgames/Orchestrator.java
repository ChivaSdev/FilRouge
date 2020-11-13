package secondgames;

import java.util.Scanner;
import java.util.ArrayList;

public class Orchestrator {
    
    private AbstractGame game;

    public Orchestrator(AbstractGame game) {
        this.game = game;
    }

    public void playGame(AbstractGame game) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ready ?");

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
