package ca.bcit.comp2522.code;

import java.util.Objects;

/**
 * Represents an iPod device designed for music.
 * IPods are considered equal if they have the same number of songs stored.
 *
 * @author Ziad Malik
 * @author Supreet Dosanj
 * @version 1.0
 */
public class IPod extends IDevice
{
    private static final String IPOD_PURPOSE = "music";
    private static final int MIN_SONGS = 0;
    private static final double MIN_VOLUME = 0.0;

    private final int numberOfSongs;
    private final double maxVolumeDecibels;

    /**
     * Constructs an IPod with the specified number of songs and maximum volume.
     *
     * @param numberOfSongs the number of songs stored
     * @param maxVolumeDecibels the maximum volume in decibels
     */
    public IPod(final int numberOfSongs,
                final double maxVolumeDecibels)
    {
        super(IPOD_PURPOSE);
        validateNumberOfSongs(numberOfSongs);
        validateMaxVolumeDecibels(maxVolumeDecibels);

        this.numberOfSongs = numberOfSongs;
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    /**
     * Returns the number of songs stored on this iPod.
     *
     * @return the number of songs
     */
    public int getNumberOfSongs()
    {
        return numberOfSongs;
    }

    /**
     * Returns the maximum volume in decibels for this iPod.
     *
     * @return the maximum volume in decibels
     */
    public double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
    }

    /**
     * Prints all details of this iPod.
     */
    @Override
    public void printDetails()
    {
        System.out.println(toString());
    }

    /**
     * Returns a string representation of this iPod.
     *
     * @return a string containing all iPod details
     */
    @Override
    public String toString()
    {
        return String.format("%s, NumberOfSongs=%d, MaxVolumeDecibels=%.1f",
                super.toString(),
                numberOfSongs,
                maxVolumeDecibels);
    }

    /**
     * Determines if this iPod is equal to another object.
     * Two iPods are equal if they have the same number of songs stored.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPod other;

        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        other = (IPod) obj;

        return numberOfSongs == other.numberOfSongs;
    }

    /**
     * Returns a hash code value for this iPod.
     *
     * @return a hash code value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(numberOfSongs);
    }

    /**
     * Validates that the number of songs is not negative.
     *
     * @param numberOfSongs the number of songs to validate
     * @throws IllegalArgumentException if numberOfSongs is negative
     */
    private static void validateNumberOfSongs(final int numberOfSongs)
    {
        if (numberOfSongs < MIN_SONGS)
        {
            throw new IllegalArgumentException("Number of songs cannot be negative: "
                    + numberOfSongs);
        }
    }

    /**
     * Validates that the maximum volume is not negative.
     *
     * @param maxVolumeDecibels the maximum volume to validate
     * @throws IllegalArgumentException if maxVolumeDecibels is negative
     */
    private static void validateMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        if (maxVolumeDecibels < MIN_VOLUME)
        {
            throw new IllegalArgumentException("Maximum volume cannot be negative: "
                    + maxVolumeDecibels);
        }
    }
}