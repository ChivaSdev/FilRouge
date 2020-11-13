package games;

import java.util.ArrayList;
import games.Game;
import players.Player;
public abstract class AbstractGame implements Game {
    /** 
     * Builds an abstract class which can be used to build a instance of any games 
     * @param player1 : Instance of Player which represents the 1st player of any game
     * @param player2 : Instance of Player which represents the 2nd player of any game
     */
    
    protected Player player1; 

    protected Player player2;

    // currentPlayer during the game
    protected Player currentPlayer;

    /**
     * Build a new instance.
     * @param player1 : Player representing the first player 
     * @param player2 : Player representing the second player
     * @param currentPlayer : Player representing the actual player (by default it'es the 1st)
     */
    public AbstractGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    /** 
     * abstract method which is executing a move in any game
     * @param move : represents a move in any game
     */
    protected abstract void doExecute(int move);

    /** 
     * method which is use to change the current player and to call doExecute() which will execute a move in any game 
     * @param move : represents a move
     */
    public void execute(int move) {
        this.doExecute(move); 
        if (this.currentPlayer == player1) {
            this.currentPlayer = player2;
        } else {    
            this.currentPlayer = player1;
        }
    }

    /**
     * method which return the current player during the game
     * @return current player
     */
    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }
    
    

  


}
