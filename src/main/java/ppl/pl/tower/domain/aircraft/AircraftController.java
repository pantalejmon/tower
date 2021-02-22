package ppl.pl.tower.domain.aircraft;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/aircraft")
class AircraftController {
    private final AircraftService aircraftService;

    @GetMapping
    List<Aircraft> getAllAircraft() {
        return aircraftService.getAllAircraft();
    }

    @GetMapping("/only-jet-engies")
    List<Aircraft> getAircraftWithJetEngines() {
        return aircraftService.getAircraftWithJetEngines();
    }

    @GetMapping("/only-prop-engies")
    List<Aircraft> getAircraftWithPropEngines() {
        return aircraftService.getAircraftWithPropEngines();
    }

    @GetMapping("/{id}")
    Aircraft getAircraft(@PathVariable("id") Long id) {
        return aircraftService.getAircraftById(id);
    }

    @PostMapping
    Aircraft add(@RequestBody Aircraft aircraft) {
        return aircraftService.addAircraft(aircraft);
    }

    @PutMapping("/{id}")
    Aircraft update(@PathVariable("id") Long id, @RequestBody Aircraft aircraft) {
        return aircraftService.updateAircraft(id, aircraft);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Long id) {
        this.aircraftService.deleteAircraft(id);
    }
}
