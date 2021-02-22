package ppl.pl.tower.domain.airport;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String iataCode;
    private String icaoCode;

    public String getCountryCode() {
        String code = ""; /* ToDo: powinny być zwrócone dwa pierwsze znaki ICAO CODE */
        return code;
    }
}
