package players;

import games.*;
import java.util.*;


/**
 * Class representing a human player.
 */
public class Human implements Player{

    protected String name;

    protected Scanner scanner;

    /**
     * Build a new instance of a Human Player
     * @param name : name of the player
     * @param scanner : instance of Scanner used to ask something to the Player
     */
    public Human(String name, Scanner scanner) {
        this.name = name;
        this.scanner = scanner;
    }

    /**
     * method used to ask which move the player wants to execute
     * @param game : Instance of Game which represents the game that has been launched
     * @return the choice of the player
     */
    @Override
    public int chooseMove(Game game) {
      int playerChoice = 0;
      boolean errorMismatch = false;
      ArrayList<Integer> validMovesList = game.validMoves();
      for (int i=0; i<validMovesList.size(); i++) {
        System.out.println(game.moveToString(validMovesList.get(i)));
      }

      System.out.println("What's your choice ? : ");

      while (!errorMismatch)
      {
        try {
          playerChoice = this.scanner.nextInt();
          while (game.isValid(playerChoice) == false) {
            System.out.println("Choice is not valid ! Try again");
            System.out.println("What's your choice ? : ");
            playerChoice = this.scanner.nextInt();
          }
          errorMismatch = true;
        } catch (InputMismatchException e) {
          this.scanner.nextLine();
          System.out.println("Choice is not valid ! Try again");
        }
      }
      return playerChoice;
    }

    /**
     * Represents as a String the name of the player
     */
    public String toString() {
        return this.name;
    }

}
