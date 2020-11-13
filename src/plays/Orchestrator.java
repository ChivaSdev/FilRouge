package plays;

import java.util.Scanner;
import players.*;
import games.*;

public class Orchestrator {

    protected Game game;

    public Orchestrator(Game game) {
        this.game = game;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ready ?");

        while (game.isOver() == false) {
            System.out.println(game.situationToString());
            System.out.println(game.getCurrentPlayer().toString() + " 's turn");
            Player currentPlayer = game.getCurrentPlayer();
            System.out.println("Valid moves : " + System.lineSeparator());
            int playerChoice = currentPlayer.chooseMove(game);
            game.execute(playerChoice);
            game.isOver();
        }

        System.out.println(game.getWinner().toString() + " has won !");
        System.out.println(game.situationToString());

        scanner.close();
    }
}