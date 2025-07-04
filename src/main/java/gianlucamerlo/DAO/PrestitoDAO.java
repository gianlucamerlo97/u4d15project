package gianlucamerlo.DAO;

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

    public Prestito findBynumeroTessera(numeroTessera) {
        Prestito found = entityManager.find(Prestito.class, prestitoId);
        if (found == null) throw new NotFoundException(prestitoId);
        return found;
    }


}
