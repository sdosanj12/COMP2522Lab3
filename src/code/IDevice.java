package ca.bcit.comp2522.code;

/**
 * Represents an abstract Apple device with a specific purpose.
 * This is the parent class for various Apple device types.
 *
 * @author Ziad Malik
 * @author Supreet Dosanj
 * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an IDevice with the specified purpose.
     *
     * @param purpose the purpose of this device
     */
    public IDevice(final String purpose)
    {
        validatePurpose(purpose);
        this.purpose = purpose;
    }

    /**
     * Returns the purpose of this device.
     *
     * @return the device's purpose
     */
    public final String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints all details of this device.
     * This method must be implemented by all child classes.
     */
    public abstract void printDetails();

    /**
     * Returns a string representation of this device.
     *
     * @return a string containing the device's purpose
     */
    @Override
    public String toString()
    {
        return String.format("Purpose=%s", purpose);
    }

    /**
     * Validates that the purpose is not null or blank.
     *
     * @param purpose the purpose to validate
     * @throws IllegalArgumentException if purpose is null or blank
     */
    private static void validatePurpose(final String purpose)
    {
        if (purpose == null || purpose.isBlank())
        {
            throw new IllegalArgumentException("Purpose must not be null or blank.");
        }
    }
}