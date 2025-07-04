package gianlucamerlo.DAO;

import gianlucamerlo.entities.Catalogo;
import gianlucamerlo.entities.Prestito;
import gianlucamerlo.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager entityManager;

    public PrestitoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Prestito newprestito) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newprestito);
        transaction.commit();
        System.out.println("Prestito aggiunto con successo!");
    }

    public void findBynumeroTessera(long numeroTessera) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        String query = "SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :numeroTessera";
        Prestito prestito = entityManager.createQuery(query, Prestito.class)
                .setParameter("numeroTessera", numeroTessera)
                .getSingleResult();
        transaction.commit();
    }


}
