package gianlucamerlo.DAO;

import gianlucamerlo.entities.Catalogo;

import gianlucamerlo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CatalogoDAO {
    private final EntityManager entityManager;

    public CatalogoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public void save(Catalogo newcatalogo){
        EntityTransaction transaction=  entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newcatalogo);
        transaction.commit();
        System.out.println("Catalogo aggiunto con successo!");

    }
    public Catalogo findById(long codiceISBN) {
        Catalogo found = entityManager.find(Catalogo.class, codiceISBN);
        if (found == null) throw new NotFoundException(codiceISBN);
        return found;
    }

    public void remove(long codiceISBN) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Catalogo catalogo = findById(codiceISBN);
        entityManager.remove(catalogo);
        transaction.commit();
        System.out.println("Catalogo rimosso con successo!");
    }

    public void findByYearOfPublication(int annoDiPubblicazione){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String query = "SELECT c FROM Catalogo c WHERE c.annoDiPubblicazione = :year";
        Catalogo catalogo = entityManager.createQuery(query, Catalogo.class)
                .setParameter("anno", annoDiPubblicazione)
                .getSingleResult();
        transaction.commit();

    }

    public void findByAuthor(String autore) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String query = "SELECT c FROM Catalogo c WHERE c.autore = :autore";
        Catalogo catalogo = entityManager.createQuery(query, Catalogo.class)
                .setParameter("autore", autore)
                .getSingleResult();
        transaction.commit();

    }

    public void findByTitle(String titolo){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String query = "SELECT c FROM Catalogo c LIKE WHERE LOWER c.titolo LIKE LOWER  :titolo";
        Catalogo catalogo = entityManager.createQuery(query, Catalogo.class)
                .setParameter("titolo", titolo)
                .getSingleResult();
        transaction.commit();
    }
}
