package secondgames;

import java.util.ArrayList;

public class Nim extends AbstractGame {

    // Initial size of matches 
    private int initNbMatches;

    // Maximum numbers of matches that a player can grab;
    private int maxNbMatches;

    // Current number of matches 
    private int currentNbMatches;

    // Constructor of the Class Nim
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

    @Override
    public String situationToString() {
        this.currentNbMatches = getCurrentNbMatches();
        return this.currentNbMatches + "left";
    }

    @Override
    public void doExecute(int nbMatches) {
        this.currentNbMatches = getCurrentNbMatches() - nbMatches;
        super.currentPlayer = super.getCurrentPlayer();
    }

    @Override
    public boolean isValid(int nbMatches) {
        //this.currentNbMatches = getCurrentNbMatches();
        return (nbMatches > 0) && (this.currentNbMatches - nbMatches >= 0) && (nbMatches <= this.maxNbMatches);
    }

    @Override
    public boolean isOver() {
        this.currentNbMatches = getCurrentNbMatches();
        return this.currentNbMatches <= 0;
    }

    @Override
    public Player getWinner(){
        super.currentPlayer = super.getCurrentPlayer();
        if (isOver() == true) {
            return super.currentPlayer;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<Integer> validMoves() {
        ArrayList<Integer> listMoves = new ArrayList<>();
        int maxNbMatches = this.maxNbMatches;
        for (int i=1; i <= this.maxNbMatches && i <= this.currentNbMatches; i++) {
            listMoves.add(i);
        }
        return listMoves;
    }

    @Override
    public String moveToString(int move) {
        return "" + move;
    } 
} 