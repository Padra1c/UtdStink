package ie.atu.footballapp.service;

import org.springframework.stereotype.Service;
import ie.atu.footballapp.model.Fixtures;

import java.util.List;
import java.util.ArrayList;

@Service
public class FixtureService {
    private final List<Fixtures>  fixtures = new ArrayList<>();
    private long nextId = 1;

    public Fixtures addFixture (Fixtures fixture) {
        fixture.setId(nextId++);
        fixtures.add(fixture);
        return fixture;
    }

    public List<Fixtures> getAllFixtures() {
        return fixtures;
    }
}
