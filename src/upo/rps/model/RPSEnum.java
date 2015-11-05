package upo.rps.model;

/**
 * Created by leamsiollaid on 14/09/15.
 */
public enum RPSEnum {
    ROCK("Rock"),PAPER("Paper"), SCISSORS("Scissors");

    private final String nom;

    RPSEnum(String nom){
        this.nom=nom;
    }

   /* public String getNom() {
        return nom;
    }*/
}
