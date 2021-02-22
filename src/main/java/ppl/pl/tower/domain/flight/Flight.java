package ppl.pl.tower.domain.flight;

import lombok.Data;
import ppl.pl.tower.domain.aircraft.Aircraft;
import ppl.pl.tower.domain.airport.Airport;
import ppl.pl.tower.domain.carrier.Carrier;

import java.time.ZonedDateTime;

@Data
class Flight {
    private Long id;
    private FlightDirection flightDirection;
    private Carrier carrier;
    private Aircraft aircraft;
    private FlightType flightType;
    private ZonedDateTime scheduleTime;
    private ZonedDateTime estimatedTime;
    private ZonedDateTime actualTime;
    private Airport remoteAirport;
}
