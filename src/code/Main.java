package ca.bcit.comp2522.code;

/**
 * Main test driver for the IDevice hierarchy.
 * Tests equality and inequality for IPod, IPad, IPhone, and IPhone17 objects.
 *
 * @author Ziad Malik
 * @author Supreet Dosanj
 * @version 1.0
 */
public class Main
{
    private static final int IPOD1_SONGS = 300;
    private static final double IPOD1_VOLUME = 80.0;
    private static final int IPOD2_SONGS = 400;
    private static final double IPOD2_VOLUME = 85.0;
    private static final int IPOD3_SONGS = 300;
    private static final double IPOD3_VOLUME = 70.0;

    private static final String IPAD1_OS = "iPadOS 15";
    private static final String IPAD2_OS = "iPadOS 14";
    private static final String IPAD3_OS = "iPadOS 15";

    private static final double IPHONE1_MINUTES = 120.0;
    private static final String IPHONE1_CARRIER = "Verizon";
    private static final double IPHONE2_MINUTES = 180.0;
    private static final String IPHONE2_CARRIER = "T-Mobile";
    private static final double IPHONE3_MINUTES = 120.0;
    private static final String IPHONE3_CARRIER = "AT&T";

    private static final double IPHONE17_1_MINUTES = 100.0;
    private static final String IPHONE17_1_CARRIER = "Verizon";
    private static final int IPHONE17_1_MEMORY = 512;
    private static final double IPHONE17_2_MINUTES = 100.0;
    private static final String IPHONE17_2_CARRIER = "Verizon";
    private static final int IPHONE17_2_MEMORY = 256;
    private static final double IPHONE17_3_MINUTES = 100.0;
    private static final String IPHONE17_3_CARRIER = "Verizon";
    private static final int IPHONE17_3_MEMORY = 512;

    /**
     * Program entry point.
     * Creates test objects and validates equality implementations.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args)
    {
        final IPod ipod1;
        final IPod ipod2;
        final IPod ipod3;

        final IPad ipad1;
        final IPad ipad2;
        final IPad ipad3;

        final IPhone iphone1;
        final IPhone iphone2;
        final IPhone iphone3;

        final IPhone17 iphone171;
        final IPhone17 iphone172;
        final IPhone17 iphone173;

        // Create IPod objects
        ipod1 = new IPod(IPOD1_SONGS, IPOD1_VOLUME);
        ipod2 = new IPod(IPOD2_SONGS, IPOD2_VOLUME);
        ipod3 = new IPod(IPOD3_SONGS, IPOD3_VOLUME);

        // Test equality and inequality for IPod
        System.out.println("IPod Equality Test:");

        if (!ipod1.equals(ipod2))
        {
            System.out.println("CORRECT: ipod1 is not equal to ipod2");
        }
        else
        {
            System.out.println("INCORRECT: ipod1 should not be equal to ipod2");
        }

        if (ipod1.equals(ipod3))
        {
            System.out.println("CORRECT: ipod1 is equal to ipod3");
        }
        else
        {
            System.out.println("INCORRECT: ipod1 should be equal to ipod3");
        }

        System.out.println();

        // Create IPad objects
        ipad1 = new IPad(true, IPAD1_OS);
        ipad2 = new IPad(false, IPAD2_OS);
        ipad3 = new IPad(true, IPAD3_OS);

        // Test equality and inequality for IPad
        System.out.println("IPad Equality Test:");

        if (!ipad1.equals(ipad2))
        {
            System.out.println("CORRECT: ipad1 is not equal to ipad2");
        }
        else
        {
            System.out.println("INCORRECT: ipad1 should not be equal to ipad2");
        }

        if (ipad1.equals(ipad3))
        {
            System.out.println("CORRECT: ipad1 is equal to ipad3");
        }
        else
        {
            System.out.println("INCORRECT: ipad1 should be equal to ipad3");
        }

        System.out.println();

        // Create IPhone objects
        iphone1 = new IPhone(IPHONE1_MINUTES, IPHONE1_CARRIER);
        iphone2 = new IPhone(IPHONE2_MINUTES, IPHONE2_CARRIER);
        iphone3 = new IPhone(IPHONE3_MINUTES, IPHONE3_CARRIER);

        // Test equality and inequality for IPhone
        System.out.println("IPhone Equality Test:");

        if (!iphone1.equals(iphone2))
        {
            System.out.println("CORRECT: iphone1 is not equal to iphone2");
        }
        else
        {
            System.out.println("INCORRECT: iphone1 should not be equal to iphone2");
        }

        if (iphone1.equals(iphone3))
        {
            System.out.println("CORRECT: iphone1 is equal to iphone3");
        }
        else
        {
            System.out.println("INCORRECT: iphone1 should be equal to iphone3");
        }

        System.out.println();

        // Create IPhone17 objects
        iphone171 = new IPhone17(IPHONE17_1_MINUTES, IPHONE17_1_CARRIER, true, IPHONE17_1_MEMORY);
        iphone172 = new IPhone17(IPHONE17_2_MINUTES, IPHONE17_2_CARRIER, true, IPHONE17_2_MEMORY);
        iphone173 = new IPhone17(IPHONE17_3_MINUTES, IPHONE17_3_CARRIER, false, IPHONE17_3_MEMORY);

        // Test equality and inequality for IPhone17
        System.out.println("IPhone17 Equality Test:");

        if (iphone171.equals(iphone172))
        {
            System.out.println("CORRECT: iphone17_1 is equal to iphone17_2");
        }
        else
        {
            System.out.println("INCORRECT: iphone17_1 should be equal to iphone17_2");
        }

        if (!iphone171.equals(iphone173))
        {
            System.out.println("CORRECT: iphone17_1 is not equal to iphone17_3");
        }
        else
        {
            System.out.println("INCORRECT: iphone17_1 should not be equal to iphone17_3");
        }

        System.out.println();
    }
}