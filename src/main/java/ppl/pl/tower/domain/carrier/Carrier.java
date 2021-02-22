package ppl.pl.tower.domain.carrier;

import lombok.Data;

@Data
public class Carrier {
    private Long id;
    private String iataCode;
    private String icaoCode;
    private String name;
}
