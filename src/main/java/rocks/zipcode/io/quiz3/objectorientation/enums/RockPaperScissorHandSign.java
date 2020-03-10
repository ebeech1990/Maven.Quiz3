package rocks.zipcode.io.quiz3.objectorientation.enums;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    PAPER("SCISSOR", "ROCK"),
    ROCK("PAPER", "SCISSOR"),
    SCISSOR("ROCK", "PAPER");
     String winner;
     String loser;

    RockPaperScissorHandSign(String winner, String loser){
        this.winner = winner;
        this.loser = loser;
    }


    public RockPaperScissorHandSign getWinner() {

        return RockPaperScissorHandSign.valueOf(winner);
    }

    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.valueOf(loser);
    }
}
