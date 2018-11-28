package net.lordofthecraft.omniscience.api.data;

import org.bukkit.block.BlockState;

import java.util.Optional;

public final class BlockTransaction {

    private BlockTransaction(BlockState before, BlockState after) {
        this.before = before;
        this.after = after;
    }

    private final BlockState before;
    private final BlockState after;

    public static BlockTransaction from(BlockState before, BlockState after) {
        return new BlockTransaction(before, after);
    }

    public Optional<BlockState> getBefore() {
        return Optional.ofNullable(before);
    }

    public Optional<BlockState> getAfter() {
        return Optional.ofNullable(after);
    }
}
