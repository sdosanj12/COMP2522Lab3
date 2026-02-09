package ca.bcit.comp2522.code;

import java.util.Objects;

/**
 * Represents an iPhone 17 device with enhanced features.
 * iPhone17 objects are considered equal if they have the same minutes remaining
 * and the same high-resolution camera status.
 *
 * @author Ziad Malik
 * @author Supreet Dosanj
 * @version 1.0
 */
public final class IPhone17 extends IPhone
{
    private static final int MIN_MEMORY = 0;

    private final boolean highResolutionCamera;
    private final int gigabytesMemory;

    /**
     * Constructs an IPhone17 with the specified attributes.
     *
     * @param minutesRemaining the minutes remaining on the phone plan
     * @param carrier the phone carrier
     * @param highResolutionCamera whether the phone has a high-resolution camera
     * @param gigabytesMemory the amount of memory in gigabytes
     */
    public IPhone17(final double minutesRemaining,
                    final String carrier,
                    final boolean highResolutionCamera,
                    final int gigabytesMemory)
    {
        super(minutesRemaining, carrier);
        validateGigabytesMemory(gigabytesMemory);

        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesMemory = gigabytesMemory;
    }

    /**
     * Returns whether this iPhone17 has a high-resolution camera.
     *
     * @return true if the phone has a high-resolution camera, false otherwise
     */
    public boolean getHighResolutionCamera()
    {
        return highResolutionCamera;
    }

    /**
     * Returns the amount of memory in gigabytes for this iPhone17.
     *
     * @return the memory in gigabytes
     */
    public int getGigabytesMemory()
    {
        return gigabytesMemory;
    }

    /**
     * Returns a string representation of this iPhone17.
     *
     * @return a string containing all iPhone17 details
     */
    @Override
    public String toString()
    {
        return String.format("%s, HighResolutionCamera=%b, GigabytesMemory=%d",
                super.toString(),
                highResolutionCamera,
                gigabytesMemory);
    }

    /**
     * Determines if this iPhone17 is equal to another object.
     * Two iPhone17 objects are equal if they have the same minutes remaining
     * and the same high-resolution camera status.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPhone17 other;

        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        other = (IPhone17) obj;

        return Double.compare(getMinutesRemaining(), other.getMinutesRemaining()) == 0
                && highResolutionCamera == other.highResolutionCamera;
    }

    /**
     * Returns a hash code value for this iPhone17.
     *
     * @return a hash code value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(getMinutesRemaining(), highResolutionCamera);
    }

    /**
     * Validates that the memory in gigabytes is not negative.
     *
     * @param gigabytesMemory the memory to validate
     * @throws IllegalArgumentException if gigabytesMemory is negative
     */
    private static void validateGigabytesMemory(final int gigabytesMemory)
    {
        if (gigabytesMemory < MIN_MEMORY)
        {
            throw new IllegalArgumentException("Gigabytes of memory cannot be negative: "
                    + gigabytesMemory);
        }
    }
}