package upo.rps.model;

import clover.org.apache.commons.lang.ObjectUtils;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by leamsiollaid on 21/09/15.
 */
public class Player {
    private String nom;
    private int score=0;
    private List <RPSEnum> listMouv;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score+= score;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public Player(String nom, List <RPSEnum> liste){
        this.nom=nom;
        this.listMouv=liste;
    }

    public Player(String nom){
        this.nom=nom;
        Random rand= new Random();
        int max=2;
        int min=1;
        int nbrAl=rand.nextInt(max-min+1)+min;

        switch(nbrAl)
        {
            case 0:
                this.listMouv.add(RPSEnum.ROCK);
                break;
            case 1:
                this.listMouv.add(RPSEnum.PAPER);
                break;
            case 2:
                this.listMouv.add(RPSEnum.SCISSORS);
                break;
            default:
                System.out.println("default swicth case");
        }

    }

    public RPSEnum getNextMove(){
        ListIterator <RPSEnum> li= this.listMouv.listIterator();

        Random rand= new Random();
        int max=2;
        int min=1;
        int nbrAl=rand.nextInt(max-min+1)+min;

        if(li.hasNext())
        {
            return li.next();
        }
        return null;
    }


}
