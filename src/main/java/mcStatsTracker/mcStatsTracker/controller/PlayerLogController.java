package mcStatsTracker.mcStatsTracker.controller;


import mcStatsTracker.mcStatsTracker.model.PlayerLog;
import mcStatsTracker.mcStatsTracker.repository.PlayerLogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class PlayerLogController {

    @Autowired
    private PlayerLogRepo repo;

    @PostMapping
    public PlayerLog logEvent (@RequestBody PlayerLog log) {
        return repo.save(log);
    }

    @GetMapping("/{playerName}")
    public List<PlayerLog> getPlayerLogs(@PathVariable String playerName) {
        return repo.findByPlayerName(playerName);
    }

    @GetMapping
    public List<PlayerLog> getAllLogs() {
        return repo.findAll();
    }
}
