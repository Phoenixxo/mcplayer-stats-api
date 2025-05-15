package mcStatsTracker.mcStatsTracker.repository;

import mcStatsTracker.mcStatsTracker.model.PlayerLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerLogRepo extends JpaRepository<PlayerLog, Long> {
    List<PlayerLog> findByPlayerName(String playerName);
}
