package games;

import players.*;
import java.util.ArrayList; 

public interface Game {

    public void execute(int move);

    public Player getCurrentPlayer();

    /**
     * abstract method which tests if the move is Valid or not
     * @param move : move that a player can execute
     * @return true if the move is valid, false if not
     */
    public abstract boolean isValid(int move);

    /**
     * abstract method which return the entire list of all the valid moves that a player can execute
     * @return array list of all the valid moves
     */
    public abstract ArrayList<Integer> validMoves();


    /**
     * abstract method which is testing if there is a winner or not
     * @return Player if he has won, null if there is no winner 
     */
    public abstract Player getWinner();

    /**
     * abstract method which tests if the game is finished or not
     * @return true if the game is finished, false if not 
     */
    public abstract boolean isOver();

    /**
     * abstract method which return a move to a String that now can be print on screen
     * @param move : move that a player can execute
     * @return a String which contains the move to a String 
     */
    public abstract String moveToString(int move);

    /**
     * abstract method which return the actual situation of the game 
     * @return a String which represents the situation of the game at any moment
     */
    public abstract String situationToString();

    /**
     * abstract method which is used to simulate a virtual player
     * @return a instance of Game 
     */

     public abstract Game copy();


}
