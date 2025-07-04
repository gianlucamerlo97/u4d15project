package gianlucamerlo.entities;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.UUID;

@Entity
@Inheritance(InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="")
public abstract class Catalogo {
    @Id
    @GeneratedValue

    protected long codiceISBN;

    protected String titolo;

    protected int annoDiPubblicazione;

    protected int numeroPagine;

    public Catalogo(){}


    public Catalogo(int annoDiPubblicazione, String titolo, int numeroPagine) {
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
    }

    public long getCodiceISBN() {
        return codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }


    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceISBN=" + codiceISBN +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
