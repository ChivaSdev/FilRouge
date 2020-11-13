package players;

import games.*;

/**
 * Build an interface which is representing a Player (human or not)
 */
public interface Player {

    /**
     * Abstract method which would be defined in classes which implements Player
     * @param game
     * @return
     */
    public int chooseMove(Game game);

}