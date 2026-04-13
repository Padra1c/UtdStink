package ie.atu.footballapp.controller;

import ie.atu.footballapp.model.Players;
import ie.atu.footballapp.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players/team/{teamName}")
    public List<Players> getPlayers(@PathVariable String teamName) {
        return playerService.getPlayersByTeam(teamName);
    }

}
