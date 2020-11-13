package games;

import java.util.ArrayList;
import players.Player;

/**
 * TicTacToe class which extends AbstractGame and would be used to launch a Tic tac toe game
*/
public class Nim extends AbstractGame {

    private int initNbMatches;

    private int maxNbMatches;

    private int currentNbMatches;

    /**
     * Build a new instance.
     * @param initNbMatches : intial size of matches
     * @param maxNbMatches : maximum number matches that a player can grab
     * @param player1 : instance of Player representing the first player 
     * @param player2 : instance of Player representing the second player
     */
    public Nim(int initNbMatches, int maxNbMatches, Player player1, Player player2) {
        super(player1, player2);
        this.initNbMatches = initNbMatches;
        this.maxNbMatches = maxNbMatches;
        this.currentNbMatches = initNbMatches;
    }

    public int getInitialNbMatches() {
        return this.initNbMatches;
    }

    public int getCurrentNbMatches() {
        return this.currentNbMatches;
    }


    /**
     * Method which represents the actual situation of the game 
     * @return String
     */
    @Override
    public String situationToString() {
        this.currentNbMatches = getCurrentNbMatches();
        return this.currentNbMatches + "left";
    }

     /**
     * method which is executing a move 
     * @param nbMatches : move that the player wants to execute
     */
    @Override
    public void doExecute(int nbMatches) {
        this.currentNbMatches = getCurrentNbMatches() - nbMatches;
        super.currentPlayer = super.getCurrentPlayer();
    }

    /**
     * Method testing if a move is valid or not
     * @param nbMatches : move that the player wants to execute
     * @return true if move is valid, false if not
     */
    @Override
    public boolean isValid(int nbMatches) {
        //this.currentNbMatches = getCurrentNbMatches();
        return (nbMatches > 0) && (this.currentNbMatches - nbMatches >= 0) && (nbMatches <= this.maxNbMatches);
    }

     /**
     * method testing if the game is finished or not (if there is a winner)
     * @return true if someone has won, false if not
     */
    @Override
    public boolean isOver() {
        this.currentNbMatches = getCurrentNbMatches();
        return this.currentNbMatches <= 0;
    }

    /**
     * method that returns a Player if there is one (it calls the wins() method ) 
     * @return player that has won, null if there is no winner
     */
    @Override
    public Player getWinner(){
        super.currentPlayer = super.getCurrentPlayer();
        if (isOver() == true) {
            return super.currentPlayer;
        } else {
            return null;
        }
    }

    /**
     * Methid which represents all the valid moves that a player can execute
     * @return Array List of all moves
     */
    @Override
    public ArrayList<Integer> validMoves() {
        ArrayList<Integer> listMoves = new ArrayList<>();
        int maxNbMatches = this.maxNbMatches;
        for (int i=1; i <= this.maxNbMatches && i <= this.currentNbMatches; i++) {
            listMoves.add(i);
        }
        return listMoves;
    }

    /**
     * Method used to represent a move to a String
     * @return a String representing a move 
     */
    @Override
    public String moveToString(int move) {
        return "" + move;
    } 

    /** Method used to simulate a virtual player  
     * @ return 
    */
    @Override
    public Nim copy() {
        Nim res = new Nim(this.initNbMatches, this.maxNbMatches, super.player1, super.player2);
        res.currentNbMatches = this.currentNbMatches;
        res.currentPlayer = super.currentPlayer;
        return res;
    }
} 