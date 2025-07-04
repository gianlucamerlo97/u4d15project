package gianlucamerlo.DAO;


import gianlucamerlo.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UtenteDAO {

    private final EntityManager entityManager;



    public UtenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Utente newutente){
        EntityTransaction transaction=  entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newutente);
        transaction.commit();
        System.out.println("Utente aggiunto con successo!");
}
