package code.ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents an iPod music player.
 *
 * @author Supreet
 * @author Ziad
 *
 * @version 1.0
 */
public final class IPod extends IDevice {
    private final int numberOfSongs;
    private final double maxVolumeDb;

    public IPod(final int numberOfSongs, final double maxVolumeDb) {
        super("music");
        this.numberOfSongs = numberOfSongs;
        this.maxVolumeDb = maxVolumeDb;
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Songs: " + numberOfSongs + ", Max Volume: " + maxVolumeDb + "dB";
    }

    @Override
    public boolean equals(final Object other) {
        if (this == other) { return true; }
        if (!(other instanceof IPod)) { return false; }
        final IPod ipod = (IPod) other;
        return numberOfSongs == ipod.numberOfSongs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSongs);
    }
}
