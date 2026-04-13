package ie.atu.footballapp.service;

import ie.atu.footballapp.model.Players;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private final List<Players> players = List.of(
            new Players(1L, "Allison Becker", "Liverpool"),
            new Players(5L, "Ibrahim Konate", "Liverpool"),
            new Players(4L, "Virgl Van Dijk", "Liverpool"),
            new Players(6L, "Milos Kerkez", "Liverpool"),
            new Players(30L, "Jermie Frimpong", "Liverpool"),
            new Players(38L, "Ryan Gravenberch", "Liverpool"),
            new Players(10L, "Alexis MacAllister", "Liverpool"),
            new Players(7l, "Florian Wirtz", "Liverpool"),
            new Players(11l, "Mohamed Salah", "Liverpool"),
            new Players(22l, "Hugo Ekitike", "Liverpool"),
            new Players(18l, "Cody Gakpo", "Liverpool"),

            new Players(1L, "David Raya", "Arsenal"),
            new Players(4L, "Ben White", "Arsenal"),
            new Players(2L, "Saliba", "Arsenal"),
            new Players(6L, "Gabriel", "Arsenal"),
            new Players(16L, "Olexander Zinchenko", "Arsenal"),
            new Players(12L, "Jurien Timber", "Arsenal"),
            new Players(19L, "Odegaard", "Arsenal"),
            new Players(41L, "Declan Rice", "Arsenal"),
            new Players(7L, "Saka", "Arsenal"),
            new Players(9L, "Jesus", "Arsenal"),
            new Players(11L, "Martinelli", "Arsenal")
    );

    public List<Players> getPlayersByTeam(String teamName) {
        List<Players> result = new ArrayList<>();

        for (Players player : players) {
            if (player.getTeamName().equalsIgnoreCase(teamName)) {
                result.add(player);
            }
        }

        if(result.isEmpty()){
            throw new RuntimeException("No player with team name " + teamName);
        }
        return result;
    }
}
