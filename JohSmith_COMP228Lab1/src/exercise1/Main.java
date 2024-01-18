package exercise1;

/**
 * Main class for exercising Singer class.
 */
public class Main {
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
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    /**
     * Default constructor for Singer class.
     */
    public Singer() {
        this.singerId = 0;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.albumsPublished = 0;
    }

    /**
     * Parameterized constructor for Singer class.
     *
     * @param singerId        The singer ID.
     * @param singerName      The singer name.
     * @param singerAddress   The singer address.
     * @param dateOfBirth     The date of birth.
     * @param albumsPublished The number of albums published.
     */
    public Singer(final int singerId, final String singerName, final String singerAddress,
            final String dateOfBirth, final int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    public int getSingerId() {
        return this.singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return this.singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerAddress() {
        return this.singerAddress;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAlbumsPublished() {
        return this.albumsPublished;
    }

    public void setAlbumsPublished(int albumsPublished) {
        this.albumsPublished = albumsPublished;
    }

    // Setter to set all instance variables at once
    public void setAllValues(int singerId, String singerName, String singerAddress, String dateOfBirth,
            int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }
}
