package exercise1;

/**
 * Singer class representing a singer.
 */
public class Singer {
    /** Default ID for a singer. */
    private static final int DEFAULT_ID = 0;

    /** Default name for a singer. */
    private static final String DEFAULT_NAME = "Unknown";

    /** Default address for a singer. */
    private static final String DEFAULT_ADDRESS = "Unknown";

    /** Default date of birth for a singer. */
    private static final String DEFAULT_DOB = "Unknown";

    /** Default number of albums published by a singer. */
    private static final int DEFAULT_ALBUMS = 0;

    /** ID of the singer. */
    private int singerId;

    /** Name of the singer. */
    private String singerName;

    /** Address of the singer. */
    private String singerAddress;

    /** Date of birth of the singer. */
    private String dateOfBirth;

    /** Number of albums published by the singer. */
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
    public void setAllValues(
            final int id,
            final String name,
            final String address,
            final String dob,
            final int albums) {
        this.singerId = id;
        this.singerName = name;
        this.singerAddress = address;
        this.dateOfBirth = dob;
        this.albumsPublished = albums;
    }
}
