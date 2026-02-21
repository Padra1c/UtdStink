package ie.atu.footballapp.controller;
import java.util.List;

import ie.atu.footballapp.model.Fixtures;
import ie.atu.footballapp.service.FixtureService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fixtures")
public class FixtureController {
    private FixtureService fixtureService;

    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @PostMapping
    public Fixtures addFixture (@Valid @RequestBody Fixtures fixture) {
        return fixtureService.addFixture(fixture);
    }

    @GetMapping
    public List<Fixtures> getFixtures() {
        return fixtureService.getAllFixtures();
    }
}