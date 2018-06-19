package fr.fxjavadevblog;

import javax.enterprise.inject.spi.CDI;

/**
 * simple Factory for creation VideoGame instances populated with UUID, ready to persist.
 * This factory is need to get a proper Entity. Entities must not be created with the "new" operator, but must be build
 * by invoking CDI.
 *
 * @author robin
 */
public class VideoGameFactory
{
    /**
     * creates and brand new VideoGame instance with its own UUID as PK.
     *
     * @return instance of a VideoGame
     */
    public static VideoGame newInstance()
    {
        // ask CDI for the instance, injecting required dependencies.
        return CDI.current().select(VideoGame.class).get();
    }
}
