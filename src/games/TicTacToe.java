package games;

import players.Player;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * TicTacToe class which extends AbstractGame and would be used to launch a Tic tac toe game
*/
public class TicTacToe extends AbstractGame {

    protected Player[][] gameTab;
    
    /**
     * Build a new instance
     * @param player1 : Player representing the first player
     * @param player2 : Player representing the second player
     */
    public TicTacToe(Player player1, Player player2) {
        super(player1, player2);
        this.gameTab = new Player[3][3];
    }

    /**
     * method which is executing a move 
     * @param move : move that the player wants to execute
     */
    @Override
    public void doExecute(int move) {
        this.gameTab[(move/3)][(move%3)] = super.currentPlayer;
    }

    /**
     * Method testing if a move is valid or not
     * @param move : move that the player wants to execute
     * @return true if move is valid, false if not
     */
    @Override
    public boolean isValid(int move) {
        return move >= 0 && move <= 8 && this.gameTab[(move/3)][(move%3)] == null;
    }

    /**
     * Methid which represents all the valid moves that a player can execute
     * @return Array List of all moves
     */
    @Override
    public ArrayList<Integer> validMoves() {
        ArrayList<Integer> listMoves = new ArrayList<>();
        for (int i=0; i<this.gameTab.length; i++) {
            for (int j=0; j<this.gameTab[i].length; j++) {
                if (this.gameTab[i][j] == null) {
                    listMoves.add(3 * i + j);
                }
            }
        }
        return listMoves;
    }

    /**
     * Method testing if there is a winner or not
     * @param player : one of the two player
     * @param row : row of the game tab
     * @param column : column of the game tab 
     * @param deltaRow : direction in a row (1 or -1)
     * @param deltaColumn : direction in a row (1 or -1)
     * @return true if there is a winner, false if not
     */
    public boolean wins(Player player, int row, int column, int deltaRow, int deltaColumn) {
        return (player.equals(this.gameTab[row][column])) && (player.equals(this.gameTab[row + deltaRow][column + deltaColumn] )) && (player.equals(this.gameTab[row + 2*deltaRow][column + 2*deltaColumn]));
    }

    /**
     * method that returns a Player if there is one (it calls the wins() method ) 
     * @return player that has won, null if there is no winner
     */
    @Override
    public Player getWinner() {
        Player[] players = {super.player1, super.player2};
        for (Player p: players) {
            for (int i=0; i < this.gameTab.length; i++) {
                if (this.wins(p, i, 0, 0, 1)) {
                    return p;
                }
            }

            for (int i=0; i < this.gameTab[0].length; i++) {
                if (this.wins(p, 0, i, 1, 0)) {
                    return p;
                }
            }

            if (this.wins(p, 0, 2, 1, -1)) {
                return p;
            }

            if (this.wins(p, 0, 0, 1, 1)) {
                return p;
            }
        }
        return null; 
    }

    /**
     * method testing if the game is finished or not (if there is a winner)
     * @return true if someone has won, false if not
     */
    @Override
    public boolean isOver() {
        if (this.getWinner() != null) {
            return true;
        } else {
            for (int i=0; i < this.gameTab.length; i++) {
                for (int j=0; j < this.gameTab[i].length; j++) {
                    if (this.gameTab[i][j] == null) {
                        return false;
                    }
                }
            }
            return true;
        }
    } 

    /**
     * Method used to represent a move to a String
     * @return a String representing a move 
     */
    @Override
    public String moveToString(int move) {
        return move + " = (" + move/3 + "," + move%3 + ")";
    }

    /**
     * Method which represents the actual situation of the game 
     * @return String
     */
    @Override
    public String situationToString() {
        String chaine = "";
        for (int i=0; i<this.gameTab.length; i++) {
            for (int j=0; j<this.gameTab[i].length; j++) {
                if (this.gameTab[i][j] == null) {
                    chaine += ". ";
                } else if (this.gameTab[i][j] == super.player1) {
                    chaine += "X ";
                } else {
                    chaine += "O ";
                }
            }
            chaine += System.lineSeparator();
        }
        return chaine;
    }

    /**
     * Method which is used to represents a copy of the game. It is used to simulate a virtual player
     * @return instance of TicTacToe
     */
    @Override 
    public TicTacToe copy() {
        TicTacToe res = new TicTacToe(super.player1, super.player2);
        res.gameTab = new Player[3][3];
        res.currentPlayer = this.currentPlayer;
        for (int i=0; i<this.gameTab.length; i++) {
            for (int j=0; j<this.gameTab[i].length; j++) {
                res.gameTab[i][j] = this.gameTab[i][j]; 
            }
        }
        return res;
    } 
}

