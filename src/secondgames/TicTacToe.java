package secondgames;

import java.util.Arrays;
import java.util.ArrayList;

public class TicTacToe extends AbstractGame {

    protected Player[][] gameTab;
    
    public TicTacToe(Player player1, Player player2) {
        super(player1, player2);
        this.gameTab = new Player[3][3];
    }

    @Override
    public void doExecute(int move) {
        this.gameTab[(move/3)][(move%3)] = super.currentPlayer;
    }

    @Override
    public boolean isValid(int move) {
        return this.gameTab[(move/3)][(move%3)] == null && move >= 0 && move <= 8;
    }

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

    public boolean wins(Player player, int row, int column, int deltaRow, int deltaColumn) {
        return (player.equals(this.gameTab[row][column])) && (player.equals(this.gameTab[row + deltaRow][column + deltaColumn] )) && (player.equals(this.gameTab[row + 2*deltaRow][column + 2*deltaColumn]));
    }

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

    @Override
    public String moveToString(int move) {
        return move + " = (" + move/3 + "," + move%3 + ")";
    }

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


}
