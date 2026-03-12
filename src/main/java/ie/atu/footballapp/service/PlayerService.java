package ie.atu.footballapp.service;

import ie.atu.footballapp.model.Players;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    private final List<Players> players = List.of(
            new Players(1L, "Allison Becker", "Liverpool"),
            new Players(2L, "Ibrahim Konate", "Liverpool"),
            new Players(3L, "Virgl Van Dijk", "Liverpool"),
            new Players(4L, "Milos Kerkez", "Liverpool"),
            new Players(5L, "Jermie Frimpong", "Liverpool"),
            new Players(6L, "Ryan Gravenberch", "Liverpool"),
            new Players(7L, "Alexis MacAllister", "Liverpool"),
            new Players(8l, "Florian Wirtz", "Liverpool"),
            new Players(9l, "Mohamed Salah", "Liverpool"),
            new Players(10l, "Hugo Ekitike", "Liverpool"),
            new Players(11l, "Cody Gakpo", "Liverpool"),

            new Players(1L, "David Raya", "Arsenal"),
            new Players(1L, "Ben White", "Arsenal"),
            new Players(1L, "Saliba", "Arsenal"),
            new Players(1L, "Gabriel", "Arsenal"),
            new Players(1L, "Olexander Zinchenko", "Arsenal"),
            new Players(1L, "Thomas Partey", "Arsenal"),
            new Players(1L, "Odegaard", "Arsenal"),
            new Players(1L, "Declan Rice", "Arsenal"),
            new Players(1L, "Saka", "Arsenal"),
            new Players(1L, "Jesus", "Arsenal"),
            new Players(1L, "Martinelli", "Arsenal")
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
