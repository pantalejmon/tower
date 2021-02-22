package ppl.pl.tower.domain.aircraft;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "aircraft")
public class Aircraft {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String iataCode;
    private String icaoCode;
    private String modelName;
    private String manufacturer;

    @Enumerated(EnumType.STRING)
    private EngineType engineType;
}
