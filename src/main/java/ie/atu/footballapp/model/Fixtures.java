package ie.atu.footballapp.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fixtures {
    private Long id;

    @NotBlank(message="Team name is needed")
    private String name;

    public Fixtures() {
    }

    public Fixtures(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
