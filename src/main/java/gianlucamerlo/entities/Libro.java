package gianlucamerlo.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.UUID;

@Entity
@Table(name = "libri")
public class Libro extends Catalogo{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private UUID id;

}
