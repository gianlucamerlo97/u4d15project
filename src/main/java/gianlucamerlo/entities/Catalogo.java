package gianlucamerlo.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "catalogo")
public abstract class Catalogo {
    @Id
    @GeneratedValue
    @Column(name = "codice_ISBN")
    private UUID codiceISBN;
    @Column(name = "titolo")
    private String titolo;
    @Column(name = "anno_di_pubblicazione")
    private int annoDiPubblicazione;
    @Column(name = "numero_pagine")
    private int numeroPagine;

    public Catalogo(){}


    public Catalogo(int annoDiPubblicazione, String titolo, int numeroPagine) {
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.titolo = titolo;
        this.numeroPagine = numeroPagine;
    }

    public UUID getCodiceISBN() {
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
