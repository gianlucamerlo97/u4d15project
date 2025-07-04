package gianlucamerlo.entities;

import gianlucamerlo.enums.Genere;
import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.UUID;

@Entity
@Table(name = "libri")
public class Libro extends Catalogo{
    private String autore;
    private Genere genere;
    //Costruttori
    public Libro(Genere genere, String autore,int annoDiPubblicazione,String titolo, int numeroDiPagine) {
        super(annoDiPubblicazione,titolo,numeroDiPagine);
        this.genere = genere;
        this.autore = autore;
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


}
