package mcStatsTracker.mcStatsTracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
public class PlayerStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String playerName;
    private int kills;
    private int deaths;
    private int blocksBroken;
    private LocalDateTime timestamp = LocalDateTime.now();

}
