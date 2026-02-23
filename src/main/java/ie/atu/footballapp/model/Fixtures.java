package ie.atu.footballapp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fixtures {
    @Schema (accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @NotBlank(message="Team name is needed")
    private String name;

    public Fixtures() {
    }

    public Fixtures(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
