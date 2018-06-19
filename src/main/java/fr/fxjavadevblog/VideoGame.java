package fr.fxjavadevblog;

import lombok.*;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.*;
import java.io.Serializable;

/**
 * simple JPA Entity, using Lombok and CDI Injected fields (UUID).
 *
 * @author robin
 */

// lombok annotations
@NoArgsConstructor(access = AccessLevel.PROTECTED) // to avoid direct instanciation bypassing the factory.
@ToString(of = {"id","name"})

// CDI Annotation
@Dependent

// JPA Annotation
@Entity
public class VideoGame implements Serializable {

    @Id
    @Inject @InjectedUUID // ask CDI to inject an brand new UUID
    @Getter
    private String id;

    @Getter @Setter
    private String name;

    // this field will work as a flag to know if the entity has already been persisted
    @Version
    @Getter
    private Long version;
}
