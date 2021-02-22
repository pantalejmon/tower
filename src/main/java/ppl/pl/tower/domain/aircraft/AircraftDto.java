package ppl.pl.tower.domain.aircraft;

import lombok.Data;
import ppl.pl.tower.domain.code.Code;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
class AircraftDto {
    private Long id;
    private Code code;
    private String description; /* ToDo: powstaje po połączeniu kolumn manufacturer oraz modelName */
    @Enumerated(EnumType.STRING)
    private EngineType engineType;
}
