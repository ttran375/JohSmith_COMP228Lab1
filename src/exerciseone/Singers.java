package exerciseone;

/**
 * Singers class representing a singer.
 * This class is not designed for extension.
 */
public final class Singers {

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
    public Singers() {
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
    public Singers(final int id, final String name, final String address,
            final String dob, final int albums) {
        this.singerId = id;
        this.singerName = name;
        this.singerAddress = address;
        this.dateOfBirth = dob;
        this.albumsPublished = albums;
    }

    /**
     * Gets the singer ID.
     *
     * @return The singer ID.
     */
    public int getSingerId() {
        return this.singerId;
    }

    /**
     * Sets the singer ID.
     *
     * @param id The new singer ID.
     */
    public void setSingerId(final int id) {
        this.singerId = id;
    }

    /**
     * Gets the singer name.
     *
     * @return The singer name.
     */
    public String getSingerName() {
        return this.singerName;
    }

    /**
     * Sets the singer name.
     *
     * @param name The new singer name.
     */
    public void setSingerName(final String name) {
        this.singerName = name;
    }

    /**
     * Gets the singer address.
     *
     * @return The singer address.
     */
    public String getSingerAddress() {
        return this.singerAddress;
    }

    /**
     * Sets the singer address.
     *
     * @param address The new singer address.
     */
    public void setSingerAddress(final String address) {
        this.singerAddress = address;
    }

    /**
     * Gets the singer's date of birth.
     *
     * @return The singer's date of birth.
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Sets the singer's date of birth.
     *
     * @param dob The new date of birth.
     */
    public void setDateOfBirth(final String dob) {
        this.dateOfBirth = dob;
    }

    /**
     * Gets the number of albums published by the singer.
     *
     * @return The number of albums published.
     */
    public int getAlbumsPublished() {
        return this.albumsPublished;
    }

    /**
     * Sets the number of albums published by the singer.
     *
     * @param albums The new number of albums published.
     */
    public void setAlbumsPublished(final int albums) {
        this.albumsPublished = albums;
    }

}
