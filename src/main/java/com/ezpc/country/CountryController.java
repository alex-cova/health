package com.ezpc.country;

import com.ezpc.domain.country.CountryModel;
import com.ezpc.domain.country.CountryRepository;
import com.ezpc.domain.country.CountryRepresentation;
import com.ezpc.domain.country.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

        if (service.existsWithName(dto.getName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("A country with name %s already exists".formatted(dto.getName()));
        }

        service.create(new CountryModel(dto));

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Created");
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryRepresentation> read(@PathVariable("id") UUID id) {

        var dto = repository.getById(id);

        if (dto == null) return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .build();

        return ResponseEntity.ok(dto);
    }

    @GetMapping("/list")
    public ResponseEntity<List<? extends CountryRepresentation>> list() {
        var list = repository.list();

        if (list.isEmpty()) return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .build();

        return ResponseEntity.ok(list);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") UUID id) {
        if (service.delete(id)) {
            return ResponseEntity.ok()
                    .build();
        }

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("Country with id '%s' not found".formatted(id));
    }

}
