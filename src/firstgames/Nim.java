package firstgames;

public class Nim {

    // Initial size of matches 
    private int initNbMatches;

    // Maximum numbers of matches that a player can grab;
    private int maxNbMatches;

    // 2 instances of Player which represents 2 different players
    private Player player1;
    private Player player2;

    // Current number of matches 
    private int currentNbMatches;

    // Current player
    private Player currentPlayer;

    // Constructor of the Class Nim
    public Nim(int initNbMatches, int maxNbMatches, Player player1, Player player2) {
        this.initNbMatches = initNbMatches;
        this.maxNbMatches = maxNbMatches;
        this.player1 = player1;
        this.player2 = player2;
        this.currentNbMatches = initNbMatches;
        this.currentPlayer = player1;
    }

    public int getInitialNbMatches() {
        return this.initNbMatches;
    }

    public int getCurrentNbMatches() {
        return this.currentNbMatches;
    }

    public Player getCurrentPlayer() {
        return this.currentPlayer;
    }

    public String situationToString() {
        this.currentNbMatches = getCurrentNbMatches();
        return this.currentNbMatches + "left";
    }

    public void removeMatches(int nbMatches) {
        this.currentNbMatches = getCurrentNbMatches() - nbMatches;
        this.currentPlayer = getCurrentPlayer();
        if (this.currentPlayer == player1) {
            this.currentPlayer = player2;
        } else {
            this.currentPlayer = player1;
        }
    }

    public boolean isValid(int nbMatches) {
        //this.currentNbMatches = getCurrentNbMatches();
        return (nbMatches > 0) && (this.currentNbMatches - nbMatches >= 0) && (nbMatches <= this.maxNbMatches);
    }

    public boolean isOver() {
        this.currentNbMatches = getCurrentNbMatches();
        return this.currentNbMatches <= 0;
    }

    public Player getWinner(){
        this.currentPlayer = getCurrentPlayer();
        if (isOver() == true) {
            return this.currentPlayer;
        } else {
            return null;
        }
    }
}