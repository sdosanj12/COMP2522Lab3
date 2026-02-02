package code.ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents a generic electronic device.
 *
 * @author Supreet
 * @author Ziad
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
     * Prints the details of the specific device.
     */
    public abstract void printDetails();

    @Override
    public String toString() {
        return "Purpose: " + purpose;
    }

    /**
     * Compares this device to another object for equality.
     *
     * @param other the object to compare to
     *
     * @return true if purposes are identical
     */
    @Override
    public boolean equals(final Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        final IDevice iDevice = (IDevice) other;
        return Objects.equals(purpose, iDevice.purpose);
    }

    /**
     * Generates a hash code for the device.
     *
     * @return hash code based on purpose
     */
    @Override
    public int hashCode() {
        return Objects.hash(purpose);
    }

}
