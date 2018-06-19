package fr.fxjavadevblog;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

    private static EntityManager em = Persistence.createEntityManagerFactory("cdi-deltaspike-demo").createEntityManager();

    @Produces
    public EntityManager getEntityManager()
    {
        return em;
    }
}
