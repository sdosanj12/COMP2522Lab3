package code.ca.bcit.comp2522.lab03;

/**
 * Represents a generic electronic device.
 *
 * @author Supreet
 * @author ziad
 *
 * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an iDevice
     *
     * @param purpose the intended use of the device
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Gets the purpose of the device.
     * @return the purpose as a String
     */
    public final String getPurpose() {
        return purpose;
    }

    /**
     * Prints the details of the specific device. [cite: 4]
     */
    public abstract void printDetails();

    @Override
    public String toString() {
        return "Purpose: " + purpose;
    }

}
