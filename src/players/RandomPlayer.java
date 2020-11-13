package players;

import java.util.Random;
import java.util.ArrayList;

import players.*;
import games.*;

public class RandomPlayer implements Player {

    protected Random random;
    
    public RandomPlayer() {
        this.random = new Random(123);
    }

    @Override
    public int chooseMove(Game game) {
        int indice = random.nextInt(game.validMoves().size());
        return game.validMoves().get(indice);
        
    }

    public String toString() {
        return "Joueur aléatoire n° " + this.hashCode();
    }
}
