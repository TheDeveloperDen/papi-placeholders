package net.developerden.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;

public class Placeholders extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "devden";
    }

    @Override
    public @NotNull String getAuthor() {
        return "BristerMitten";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, @NotNull String params) {
        if ("discord_timestamp".equals(params)) {
            return String.valueOf(Instant.now().getEpochSecond());
        }
        return null;
    }
}
