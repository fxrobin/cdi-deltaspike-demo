package fr.fxjavadevblog;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.persistence.EntityManager;
import java.time.LocalDateTime;

public class MainProg {

   public static void main(String... args)
   {
       System.out.printf("Starting ... %s%n", LocalDateTime.now());
       SeContainerInitializer initializer = SeContainerInitializer.newInstance();

/** container.close() in AutoCloseable, The application context is started automatically by the container on start up. */
       try (SeContainer container = initializer.initialize()) {
           System.out.printf("Container initialisé%n");
           EntityManager em = container.select(EntityManager.class).get();
           System.out.printf("EntityManager : %s%n", em);
           VideoGameRepository repo = container.select(VideoGameRepository.class).get();
           VideoGame v = new VideoGame();
           v.setName("XENON");
           repo.save(v);
           System.out.printf("VideoGame id: %d", v.getId());

       }

   }
}
