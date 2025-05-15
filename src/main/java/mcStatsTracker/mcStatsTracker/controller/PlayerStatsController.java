package mcStatsTracker.mcStatsTracker.controller;

import mcStatsTracker.mcStatsTracker.model.PlayerStat;
import mcStatsTracker.mcStatsTracker.repository.PlayerStatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/stats")
public class PlayerStatsController {

    @Autowired
    private PlayerStatRepository repo;

    @PostMapping
    public PlayerStat addStat(@RequestBody PlayerStat stat) {
        return repo.save(stat);
    }

    @PostMapping("/block")
    public PlayerStat incrementBlockBreak(@RequestParam String playerName) {

        PlayerStat stat = repo.findByPlayerName(playerName);

        if (stat != null) {
            stat.setBlocksBroken(stat.getBlocksBroken() + 1);
        } else {
            stat = new PlayerStat();
            stat.setPlayerName(playerName);
            stat.setBlocksBroken(1);
        }
        return repo.save(stat);
    }

    @PostMapping("/kills")
    public PlayerStat incrementKills(@RequestParam String playerName) {
        PlayerStat stat = repo.findByPlayerName(playerName);
        if (stat == null) {
            stat = new PlayerStat();
            stat.setPlayerName(playerName);
            stat.setKills(1);
            stat.setDeaths(0);
            stat.setBlocksBroken(0);
        } else {
            stat.setKills(stat.getKills() + 1);
        }
        return repo.save(stat);
    }

    @PostMapping("/deaths")
    public PlayerStat incrementDeaths(@RequestParam String playerName) {
        PlayerStat stat = repo.findByPlayerName(playerName);
        if (stat == null) {
            stat = new PlayerStat();
            stat.setPlayerName(playerName);
            stat.setKills(0);
            stat.setDeaths(1);
            stat.setBlocksBroken(0);
        } else {
            stat.setKills(stat.getDeaths() + 1);
        }
        return repo.save(stat);
    }

    @GetMapping("/{player}")
    public PlayerStat getStatsByPlayer(@PathVariable String player) {
        return repo.findByPlayerName(player);
    }
}
