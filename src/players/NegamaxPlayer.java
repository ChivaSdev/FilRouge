package players;

import games.*;
import plays.*;

public class NegamaxPlayer implements Player{

    public NegamaxPlayer() {}

    public int evaluate(Game situation) {
        if (situation.isOver() == true) {
            if (situation.getWinner() == null) {
                return 0;
            } else if (situation.getWinner().equals(situation.getCurrentPlayer())) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // situation is not a finished situation
            Integer res = null;
            for (int move : situation.validMoves()) {
                Game currentSituation = situation.copy();
                currentSituation.execute(move);
                int value = -(evaluate(currentSituation));
                if (res == null || value > res) {
                    res = value;
                }
            }
            return res;
        }
    }

    @Override
    public int chooseMove(Game situation) {
        Integer bestValue = null;
        Integer bestMove = null; 
        for (int move : situation.validMoves()) {
            Game currentSituation = situation.copy();
            currentSituation.execute(move);
            int value = -(evaluate(currentSituation));
            if (bestValue == null || value > bestValue) {
                bestValue = value;
                bestMove = move;
            }
        }
        return bestMove;
    }

    public String toString() {
        return "Joueur aléatoire : " + this.hashCode();
    }
}
