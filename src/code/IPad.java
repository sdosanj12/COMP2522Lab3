package ca.bcit.comp2522.code;

import java.util.Objects;

/**
 * Represents an iPad device designed for learning.
 * IPads are considered equal if they have the same operating system version.
 *
 * @author Ziad Malik
 * @version 1.0
 */
public class IPad extends IDevice
{
    private static final String IPAD_PURPOSE = "learning";

    private final boolean hasCase;
    private final String osVersion;

    /**
     * Constructs an IPad with the specified case status and OS version.
     *
     * @param hasCase whether the iPad has a case
     * @param osVersion the operating system version (must not be null or blank)
     * @throws IllegalArgumentException if osVersion is null or blank
     */
    public IPad(final boolean hasCase,
                final String osVersion)
    {
        super(IPAD_PURPOSE);
        validateOsVersion(osVersion);

        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Returns whether this iPad has a case.
     *
     * @return true if the iPad has a case, false otherwise
     */
    public boolean getHasCase()
    {
        return hasCase;
    }

    /**
     * Returns the operating system version of this iPad.
     *
     * @return the OS version
     */
    public String getOsVersion()
    {
        return osVersion;
    }

    /**
     * Prints all details of this iPad.
     */
    @Override
    public void printDetails()
    {
        System.out.println(toString());
    }

    /**
     * Returns a string representation of this iPad.
     *
     * @return a string containing all iPad details
     */
    @Override
    public String toString()
    {
        return String.format("%s, HasCase=%b, OsVersion=%s",
                super.toString(),
                hasCase,
                osVersion);
    }

    /**
     * Determines if this iPad is equal to another object.
     * Two iPads are equal if they have the same operating system version.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPad other;

        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        other = (IPad) obj;

        return Objects.equals(osVersion, other.osVersion);
    }

    /**
     * Returns a hash code value for this iPad.
     *
     * @return a hash code value
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(osVersion);
    }

    /**
     * Validates that the OS version is not null or blank.
     *
     * @param osVersion the OS version to validate
     * @throws IllegalArgumentException if osVersion is null or blank
     */
    private static void validateOsVersion(final String osVersion)
    {
        if (osVersion == null || osVersion.isBlank())
        {
            throw new IllegalArgumentException("OS version must not be null or blank.");
        }
    }
}