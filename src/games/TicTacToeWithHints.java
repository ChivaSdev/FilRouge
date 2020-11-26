package games;

import players.Player;
import java.util.Arrays;
import java.util.ArrayList;

public class TicTacToeWithHints extends TicTacToe {

    public TicTacToeWithHints(Player player1, Player player2) {
        super(player1, player2);
    }

    public ArrayList<Integer> hints()
    {
      Player opponent;
      ArrayList<Integer> listTempHints = super.validMoves();
      ArrayList<Integer> listHints = new ArrayList<Integer>();

      if(super.getCurrentPlayer() == super.player1)
      {
        opponent = super.player2;
      }
      else
      {
        opponent = super.player1;
      }

      for (Integer i : listTempHints)
      {
        super.gameTab[i/3][i%3] = opponent;
        if(super.getWinner() == opponent)
        {
          listHints.add(i);
        }
        super.gameTab[i/3][i%3] = null;
      }
      return listHints;
    }
}
