package secondgames;

import java.util.ArrayList;

public abstract class AbstractGame {
    /** 
     * Builds an abstract class which can be used to build a instance of any games 
     * @param player1 : Instance of Player which represents the 1st player of any game
     * @param player2 : Instance of Player which represents the 2nd player of any game
     */
    
    protected Player player1; 

    protected Player player2;

    // currentPlayer during the game
    protected Player currentPlayer;

    // Constructor of the class
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
    
    /**
     * abstract method which return the entire list of all the valid moves that a player can execute
     * @return array list of all the valid moves
     */
    public abstract ArrayList<Integer> validMoves();

    /**
     * abstract method which return the actual situation of the game 
     * @return a String which represents the situation of the game at any moment
     */
    public abstract String situationToString();

    /**
     * abstract method which return a move to a String that now can be print on screen
     * @param move : move that a player can execute
     * @return a String which contains the move to a String 
     */
    public abstract String moveToString(int move);

    /**
     * abstract method which tests if the game is finished or not
     * @return true if the game is finished, false if not 
     */
    public abstract boolean isOver();

    /**
     * abstract method which is testing if there is a winner or not
     * @return Player if he has won, null if there is no winner 
     */
    public abstract Player getWinner();

    /**
     * abstract method which tests if the move is Valid or not
     * @param move : move that a player can execute
     * @return true if the move is valid, false if not
     */
    public abstract boolean isValid(int move);
}
