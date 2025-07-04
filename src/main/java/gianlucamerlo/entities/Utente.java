package gianlucamerlo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Utente {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private long numeroTessera;

    public Utente(){}
    public Utente(String nome,String cognome,LocalDate dataDiNascita,long numeroTessera){
        this.nome=nome;
        this.cognome=cognome;
        this.dataDiNascita=dataDiNascita;
        this.numeroTessera=numeroTessera;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public long getNumeroTessera() {
        return numeroTessera;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void setNumeroTessera(long numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
