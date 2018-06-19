package fr.fxjavadevblog;

import org.jboss.weld.junit5.EnableWeld;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Slf4j
@EnableWeld
class SimpleTest {

	@WeldSetup // This is need to discovery DeltaSpike functionnalities
	public WeldInitiator weld = WeldInitiator.performDefaultDiscovery();

	@Inject
	private VideoGameRepository repo;

	@Test
	void test() {
		log.info("Ok");
		log.info("Repo {}", repo);
	}

}
