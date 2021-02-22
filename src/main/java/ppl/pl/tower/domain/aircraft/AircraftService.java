package ppl.pl.tower.domain.aircraft;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class AircraftService {
    private final AircraftRepository aircraftRepository;

    Aircraft getAircraftById(Long id) {
        return aircraftRepository.findById(id).get();
    }

    List<Aircraft> getAllAircraft() {
        return aircraftRepository.findAll();
    }

    Aircraft addAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    Aircraft updateAircraft(Long id, Aircraft aircraft) {
        if (id != null && id.equals(aircraft.getId())) {
            return aircraftRepository.save(aircraft);
        }
        return null;
    }

    void deleteAircraft(Long id) {
        aircraftRepository.deleteById(id);
    }

    List<Aircraft> getAircraftWithJetEngines() {
        return null; /* ToDo: ograniczamy listę statków powietrznych do tych, które posiadają silniki odrzutowe za pomocą STREAM'ów */
    }

    List<Aircraft> getAircraftWithPropEngines() {
        return null; /* ToDo: ograniczamy listę statków powietrznych do tych, które posiadają silniki odrzutowe za pomocą JPA */
    }
}
