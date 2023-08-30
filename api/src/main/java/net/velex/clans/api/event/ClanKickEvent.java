package net.velex.clans.api.event;

import com.google.common.base.Preconditions;
import net.velex.clans.api.model.internal.ClanDataInternalModel;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ClanKickEvent extends ClanEvent {
  private final Player kickedPlayer;
  private final String executorPlayerName;
  
  public ClanKickEvent(final @NotNull ClanDataInternalModel clanDataInternalModel, final @NotNull Player kickedPlayer, final @NotNull String executorPlayerName) {
    super(clanDataInternalModel);
    this.kickedPlayer = Preconditions.checkNotNull(kickedPlayer, "Kicked player reference cannot be null.");
    this.executorPlayerName = Preconditions.checkNotNull(executorPlayerName, "Executor player name cannot be null.");
  }
  
  /**
   * Returns the {@link Player} reference for the player involved on this event.
   *
   * @return A {@link Player} reference type.
   */
  public @NotNull Player kickedPlayer() {
    return kickedPlayer;
  }
  
  /**
   * Returns the name of the player who executed the kick.
   *
   * @return The name of player who kick.
   */
  public @NotNull String executorPlayerName() {
    return executorPlayerName;
  }
}