package mcStatsTracker.mcStatsTracker.repository;

import mcStatsTracker.mcStatsTracker.model.PlayerStat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface PlayerStatRepository extends JpaRepository<PlayerStat, Long> {
    PlayerStat findByPlayerName(String playerName);
}
