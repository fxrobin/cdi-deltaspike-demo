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
    @SuppressWarnings("unused") // just remove the warning, because the field serves as CDI Producer and the IDE cannot detect it.
    private static EntityManager em = Persistence.createEntityManagerFactory(UNIT_NAME).createEntityManager();

    /**
     * produces randomly generated UUID for primary keys.
     *
     * @return UUID as a HEXA-STRING
     *
     */
    @Produces
    @InjectedUUID
    @SuppressWarnings("unused") // just remove the warning, because the method serves as CDI Producer and the IDE cannot detect it.
    public String produceUUIDAsString()
    {
        return UUID.randomUUID().toString();
    }
}
