package gianlucamerlo;

import gianlucamerlo.DAO.CatalogoDAO;
import gianlucamerlo.DAO.PrestitoDAO;


import gianlucamerlo.DAO.UtenteDAO;
import gianlucamerlo.entities.Libro;
import gianlucamerlo.entities.Utente;
import gianlucamerlo.enums.Genere;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
private static final EntityManagerFactory emf= Persistence.createEntityManagerFactory("catalogo_bibliografico");
    public static void main(String[] args) {
        EntityManager em=emf.createEntityManager();
        System.out.println("Funziona!");

        CatalogoDAO cd= new CatalogoDAO(em);
        PrestitoDAO pd= new PrestitoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);


        Libro libron2 = new Libro("GIorgio fallaci",2020,"Cucina",220,Genere.THRILLER);
        cd.save(libron2);

        
    }
}
