package gianlucamerlo.entities;

import gianlucamerlo.enums.Genere;
import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.UUID;

@Entity

public class Libro extends Catalogo{
    private String autore;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    //Costruttori
    public Libro( String autore,int annoDiPubblicazione,String titolo, int numeroDiPagine,Genere genere) {
        super(annoDiPubblicazione,titolo,numeroDiPagine);

        this.autore = autore;
        this.genere=genere;
    }
    public Libro(){}
    //getters and setters
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", genere=" + genere +
                ", codiceISBN=" + codiceISBN +
                ", numeroPagine=" + numeroPagine +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                "} " + super.toString();
    }
}
