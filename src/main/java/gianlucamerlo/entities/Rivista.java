package gianlucamerlo.entities;

import gianlucamerlo.enums.Periodicità;
import jakarta.persistence.Entity;

import java.time.Period;

@Entity
public class Rivista extends Catalogo{
    private Periodicità periodicità;

    public Rivista(){}

    public Rivista(int annoDiPubblicazione,String titolo, int numeroDiPagine,Periodicità periodicità){
        super(annoDiPubblicazione,titolo,numeroDiPagine);
        this.periodicità=periodicità;
    }

}
