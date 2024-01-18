/**
 * This package contains classes related to Exercise 1.
 */
package exercise1;

public class Main {
    public static void main(String[] args) {
        // Utility classes should not be instantiated
        // Use static methods or constants directly
        displaySingerDetails(createSingerWithDefaultValues());

        Singer singer1 = createSingerWithAllValues(1, "John Doe", "123 Main St", "1990-01-01", 5);

        System.out.println("\nValues after setting all at once:");
        displaySingerDetails(singer1);

        singer1.setSingerName("Jane Doe");
        singer1.setSingerAddress("456 Oak St");
        singer1.setDateOfBirth("1985-05-15");
        singer1.setAlbumsPublished(8);

        System.out.println("\nCurrent values after individual changes:");
        displaySingerDetails(singer1);
    }

    private static void displaySingerDetails(Singer singer) {
        System.out.println("Singer ID: " + singer.getSingerId());
        System.out.println("Singer Name: " + singer.getSingerName());
        System.out.println("Singer Address: " + singer.getSingerAddress());
        System.out.println("Date of Birth: " + singer.getDateOfBirth());
        System.out.println("Albums Published: " + singer.getAlbumsPublished() + "\n");
    }

    // Factory method to create Singer instance with default values
    private static Singer createSingerWithDefaultValues() {
        return new Singer(0, "Unknown", "Unknown", "Unknown", 0);
    }

    // Factory method to create Singer instance with all values
    private static Singer createSingerWithAllValues(int singerId, String singerName, String singerAddress,
            String dateOfBirth, int albumsPublished) {
        return new Singer(singerId, singerName, singerAddress, dateOfBirth, albumsPublished);
    }
}

class Singer {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    public Singer() {
        this.singerId = 0;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.albumsPublished = 0;
    }

    public Singer(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished) {
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
