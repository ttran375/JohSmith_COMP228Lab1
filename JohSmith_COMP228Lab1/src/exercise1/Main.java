package exercise1;

/**
 * Main class for exercising Singer class.
 */
public final class Main {
    private Main() {
        // Prevent instantiation
    }

    public static void main(final String[] args) {
        Singer singer1 = new Singer();

        System.out.println("Default values for singer1:");
        displaySingerDetails(singer1);

        singer1.setAllValues(1, "John Doe", "123 Main St", "1990-01-01", 5);

        System.out.println("\nValues after setting all at once:");
        displaySingerDetails(singer1);

        singer1.setSingerName("Jane Doe");
        singer1.setSingerAddress("456 Oak St");
        singer1.setDateOfBirth("1985-05-15");
        singer1.setAlbumsPublished(8);

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
        System.out.println("Albums Published: " +
                singer.getAlbumsPublished() + "\n");
    }
}

/**
 * Singer class representing a singer.
 */
class Singer {
    private static final int DEFAULT_ID = 0;
    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_ADDRESS = "Unknown";
    private static final String DEFAULT_DOB = "Unknown";
    private static final int DEFAULT_ALBUMS = 0;

    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    /**
     * Default constructor for Singer class.
     */
    public Singer() {
        this.singerId = DEFAULT_ID;
        this.singerName = DEFAULT_NAME;
        this.singerAddress = DEFAULT_ADDRESS;
        this.dateOfBirth = DEFAULT_DOB;
        this.albumsPublished = DEFAULT_ALBUMS;
    }

    /**
     * Parameterized constructor for Singer class.
     *
     * @param id      The singer ID.
     * @param name    The singer name.
     * @param address The singer address.
     * @param dob     The date of birth.
     * @param albums  The number of albums published.
     */
    public Singer(final int id, final String name, final String address,
            final String dob, final int albums) {
        this.singerId = id;
        this.singerName = name;
        this.singerAddress = address;
        this.dateOfBirth = dob;
        this.albumsPublished = albums;
    }

    public int getSingerId() {
        return this.singerId;
    }

    public void setSingerId(final int id) {
        this.singerId = id;
    }

    public String getSingerName() {
        return this.singerName;
    }

    public void setSingerName(final String name) {
        this.singerName = name;
    }

    public String getSingerAddress() {
        return this.singerAddress;
    }

    public void setSingerAddress(final String address) {
        this.singerAddress = address;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(final String dob) {
        this.dateOfBirth = dob;
    }

    public int getAlbumsPublished() {
        return this.albumsPublished;
    }

    public void setAlbumsPublished(final int albums) {
        this.albumsPublished = albums;
    }

    // Setter to set all instance variables at once
    public void setAllValues(final int id, final String name, final String address, final String dob,
            final int albums) {
        this.singerId = id;
        this.singerName = name;
        this.singerAddress = address;
        this.dateOfBirth = dob;
        this.albumsPublished = albums;
    }
}