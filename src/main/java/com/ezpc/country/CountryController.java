package com.ezpc.country;

import com.ezpc.domain.country.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/country")
public class CountryController {

    private final CountryService service;
    private final CountryRepository repository;

    public CountryController(CountryService service, CountryRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PutMapping("/")
    public ResponseEntity<String> create(@RequestBody CountryDto dto) {

        new CountryCreateAction(service)
                .accept(dto);

        return ok("created");
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryRepresentation> read(@PathVariable("id") UUID id) {

        var dto = new CountryReadAction(repository)
                .apply(id);

        return ok(dto);
    }

    @GetMapping("/list")
    public ResponseEntity<List<? extends CountryRepresentation>> list() {
        var countryList = new CountryReadAction(repository)
                .list();

        if (countryList.isEmpty()) return ResponseEntity.noContent().build();

        return ok(countryList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
        new CountryDeleteAction(service)
                .accept(id);

        return ok("Deleted");
    }

}
