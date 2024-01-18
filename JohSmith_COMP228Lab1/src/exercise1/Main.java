package exercise1;

/**
 * Main class for exercising Singer class.
 */
public class Main {
    /**
     * The initial number of albums for a singer.
     */
    private static final int INITIAL_ALBUMS = 5;

    /**
     * The updated number of albums for a singer.
     */
    private static final int UPDATED_ALBUMS = 8;

    private Main() {
        // Prevent instantiation
    }

    /**
     * Entry point for the application.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        Singer singer1 = new Singer();

        System.out.println("Default values for singer1:");
        displaySingerDetails(singer1);

        singer1.setAllValues(1, "John Doe", "123 Main St",
                "1990-01-01", INITIAL_ALBUMS);

        System.out.println("\nValues after setting all at once:");
        displaySingerDetails(singer1);

        singer1.setSingerName("Jane Doe");
        singer1.setSingerAddress("456 Oak St");
        singer1.setDateOfBirth("1985-05-15");
        singer1.setAlbumsPublished(UPDATED_ALBUMS);

        System.out.println("\nCurrent values after individual changes:");
        displaySingerDetails(singer1);
    }

    /**
     * Display details of a singer.
     *
     * @param singer The singer object.
     */
    private static void displaySingerDetails(final Singer singer) {
        System.out.println("Singer ID: " + singer.getSingerId());
        System.out.println("Singer Name: " + singer.getSingerName());
        System.out.println("Singer Address: " + singer.getSingerAddress());
        System.out.println("Date of Birth: " + singer.getDateOfBirth());
        System.out.println("Albums Published: "
                + singer.getAlbumsPublished() + "\n");
    }
}
