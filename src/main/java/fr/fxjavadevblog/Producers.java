package fr.fxjavadevblog;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.UUID;

@ApplicationScoped
public class Producers {

    public static final String UNIT_NAME = "cdi-deltaspike-demo";

    @Produces
    private static EntityManager em = Persistence.createEntityManagerFactory(UNIT_NAME).createEntityManager();

}
