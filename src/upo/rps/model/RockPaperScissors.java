package upo.rps.model;

/**
 * Created by leamsiollaid on 14/09/15.
 */
public class RockPaperScissors {

    public Result play(Player p1, Player p2 ){

        while(p1.getNextMove()!=null && p2.getNextMove()!=null)
        {
            Result res=play(p1.getNextMove(),p2.getNextMove());
            switch(res){
                case WIN:
                    p1.setScore(1);
                    break;
                case TIE:
                    p1.setScore(1);
                    p2.setScore(1);
                    break;
                case LOST:
                    p2.setScore(1);
            }
        }

        if(p1.getScore()> p2.getScore()){
            return Result.WIN;
        }
        else if (p1.getScore()==p2.getScore()){
            return Result.TIE;
        }
        else{
            return Result.LOST;
        }



    }

    public Result play(RPSEnum p1, RPSEnum p2)
    {
        if(     (p1==RPSEnum.ROCK && p2==RPSEnum.SCISSORS)
                ||
                (p1==RPSEnum.PAPER && p2== RPSEnum.ROCK)
                ||
                (p1==RPSEnum.SCISSORS && p2 == RPSEnum.PAPER )
                ){
            return Result.WIN;
        }

        if(p1==p2) return Result.TIE;

        else return Result.LOST;



    }


}
