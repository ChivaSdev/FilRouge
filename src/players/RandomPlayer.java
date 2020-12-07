package players;

import java.util.Random;
import java.util.ArrayList;

import players.*;
import games.*;

public class RandomPlayer implements Player {

    protected Random random;
    
    public RandomPlayer(Random random) {
        this.random = new Random();
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
