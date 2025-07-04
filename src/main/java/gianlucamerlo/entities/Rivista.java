package gianlucamerlo.entities;

import gianlucamerlo.enums.Periodicità;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.Period;

@Entity
public class Rivista extends Catalogo{
    @Enumerated(EnumType.STRING)
    private Periodicità periodicità;

    public Rivista(){}

    public Rivista(int annoDiPubblicazione,String titolo, int numeroDiPagine,Periodicità periodicità){
        super(annoDiPubblicazione,titolo,numeroDiPagine);
        this.periodicità=periodicità;
    }

    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }
}
