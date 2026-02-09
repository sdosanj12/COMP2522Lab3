package ca.bcit.comp2522.code;

import java.util.Objects;

/**
 * Represents an iPhone device designed for talking.
 * IPhones are considered equal if they have the same amount of minutes remaining.
 *
 * @author Ziad Malik
 * @author Supreet Dosanj
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private static final String IPHONE_PURPOSE = "talking";
    private static final double MIN_MINUTES = 0.0;

    private final double minutesRemaining;
    private final String carrier;

    /**
     * Constructs an IPhone with the specified minutes remaining and carrier.
     *
     * @param minutesRemaining the minutes remaining on the phone plan
     * @param carrier the phone carrier
     */
    public IPhone(final double minutesRemaining,
                  final String carrier)
    {
        super(IPHONE_PURPOSE);
        validateMinutesRemaining(minutesRemaining);
        validateCarrier(carrier);

        this.minutesRemaining = minutesRemaining;
        this.carrier = carrier;
    }

    /**
     * Returns the minutes remaining on this iPhone's phone plan.
     *
     * @return the minutes remaining
     */
    public double getMinutesRemaining()
    {
        return minutesRemaining;
    }

    /**
     * Returns the carrier for this iPhone.
     *
     * @return the carrier
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Prints all details of this iPhone.
     */
    @Override
    public void printDetails()
    {
        System.out.println(toString());
    }

    /**
     * Returns a string representation of this iPhone.
     *
     * @return a string containing all iPhone details
     */
    @Override
    public String toString()
    {
        return String.format("%s, MinutesRemaining=%.1f, Carrier=%s",
                super.toString(),
                minutesRemaining,
                carrier);
    }

    /**
     * Determines if this iPhone is equal to another object.
     * Two iPhones are equal if they have the same amount of minutes remaining.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPhone other;

        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        other = (IPhone) obj;

        return Double.compare(minutesRemaining, other.minutesRemaining) == 0;
    }

    /**
     * Returns a hash code value for this iPhone.
     *
     * @return a hash code value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemaining);
    }

    /**
     * Validates that the minutes remaining is not negative.
     *
     * @param minutesRemaining the minutes remaining to validate
     * @throws IllegalArgumentException if minutesRemaining is negative
     */
    private static void validateMinutesRemaining(final double minutesRemaining)
    {
        if (minutesRemaining < MIN_MINUTES)
        {
            throw new IllegalArgumentException("Minutes remaining cannot be negative: "
                    + minutesRemaining);
        }
    }

    /**
     * Validates that the carrier is not null or blank.
     *
     * @param carrier the carrier to validate
     * @throws IllegalArgumentException if carrier is null or blank
     */
    private static void validateCarrier(final String carrier)
    {
        if (carrier == null || carrier.isBlank())
        {
            throw new IllegalArgumentException("Carrier must not be null or blank.");
        }
    }
}