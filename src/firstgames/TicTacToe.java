package firstgames;

import java.util.Arrays;
import java.util.ArrayList;

public class TicTacToe {

    protected Player player1;

    protected Player player2;

    protected Player currentPlayer;

    protected Player[][] gameTab;

    
    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.gameTab = new Player[3][3];
    }
    
    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public void execute(int move) {
        this.gameTab[(move/3)][(move%3)] = this.currentPlayer;
        if (this.currentPlayer == player1) {
            this.currentPlayer = player2; 
        } else {
            this.currentPlayer = player1;
        }
    }

    public boolean isValid(int move) {
        return this.gameTab[(move/3)][(move%3)] == null;
    }

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

    public boolean wins(Player player, int row, int column, int deltaRow, int deltaColumn) {
        return (player.equals(this.gameTab[row][column])) && (player.equals(this.gameTab[row + deltaRow][column + deltaColumn] )) && (player.equals(this.gameTab[row + 2*deltaRow][column + 2*deltaColumn]));
    }

    public Player getWinner() {
        Player[] players = {this.player1, this.player2};
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

    public String moveToString(int move) {
        return move + " = (" + move/3 + "," + move%3 + ")";
    }

    public String situationToString() {
        String chaine = "";
        for (int i=0; i<this.gameTab.length; i++) {
            for (int j=0; j<this.gameTab[i].length; j++) {
                if (this.gameTab[i][j] == null) {
                    chaine += ". ";
                } else if (this.gameTab[i][j] == this.player1) {
                    chaine += "X ";
                } else {
                    chaine += "O ";
                }
            }
            chaine += System.lineSeparator();
        }
        return chaine;
    }


}

