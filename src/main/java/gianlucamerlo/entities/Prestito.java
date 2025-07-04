package gianlucamerlo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;
    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "id_elemento_prestato")
    private Catalogo elementoPrestato;
    private LocalDate dataInizioPrestito;
    private LocalDate dataRestituzioneEffettiva;
    private LocalDate dataRestituzionePrevista;

    public Prestito(){}
    public Prestito(Utente utente,Catalogo elementoPrestato,LocalDate dataInizioPrestito,LocalDate dataRestituzioneEffettiva,LocalDate dataRestituzionePrevista){
        this.utente=utente;
        this.elementoPrestato=elementoPrestato;
        this.dataInizioPrestito=dataInizioPrestito;
        this.dataRestituzionePrevista=dataRestituzionePrevista.plusDays(30);
        this.dataRestituzioneEffettiva=dataRestituzioneEffettiva;
    }

    public long getId() {
        return id;
    }

    public Utente getUtente() {
        return utente;
    }

    public Catalogo getElementoPrestato() {
        return elementoPrestato;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setElementoPrestato(Catalogo elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }
}
