package fr.fxjavadevblog;

import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
@EnableWeld
class VideoGameRepositoryTest {

	@WeldSetup // This is need to discovery DeltaSpike functionnalities
	public WeldInitiator weld = WeldInitiator.performDefaultDiscovery();

	@Inject
	private VideoGameRepository repo;

	@Test
	void test()
	{
		VideoGame videoGame = new VideoGame();
		videoGame.setName("XENON");
		repo.save(videoGame);
		// testing the ID generated after persisting entity by the JPA Provider.
		Assert.assertNotNull(videoGame.getId());
		log.info("Video Game : {}", videoGame);
	}

}
