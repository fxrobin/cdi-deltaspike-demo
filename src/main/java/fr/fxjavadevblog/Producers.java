package fr.fxjavadevblog;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.UUID;

/**
 * composite of CDI Producers.
 *
 * @author robin
 */
@ApplicationScoped
public class Producers
{
    public static final String UNIT_NAME = "cdi-deltaspike-demo";

    /**
     * produces the instance of entity manager for the application and for DeltaSpike.
     */
    @Produces
    private static EntityManager em = Persistence.createEntityManagerFactory(UNIT_NAME).createEntityManager();

    /**
     * produces randomly generated UUID for primary keys.
     *
     * @return UUID as a HEXA-STRING
     *
     */
    @Produces
    @InjectedUUID
    public String produceUUIDAsString()
    {
        return UUID.randomUUID().toString();
    }
}
