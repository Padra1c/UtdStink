package ie.atu.footballapp.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fixtures {
    private Long id;

    @NotBlank(message="Team 1 name is needed")
    private String team1;
    @NotBlank(message="Team 2 name is needed")
    private String team2;

    public Fixtures() {

    }

    public Fixtures(Long id, String name) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }
}
