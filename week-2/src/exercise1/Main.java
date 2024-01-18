package exercise1;

import java.util.Scanner;

class Singer {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    // No-argument constructor
    public Singer() {
        // Default values
        this.singerId = 0;
        this.singerName = "Unknown";
        this.singerAddress = "Unknown";
        this.dateOfBirth = "Unknown";
        this.albumsPublished = 0;
    }

    // Constructor with 5 arguments
    public Singer(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    // Setters and Getters
    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerAddress() {
        return singerAddress;
    }

    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAlbumsPublished() {
        return albumsPublished;
    }

    public void setAlbumsPublished(int albumsPublished) {
        this.albumsPublished = albumsPublished;
    }

    // Setter to set all values at once
    public void setAllValues(int singerId, String singerName, String singerAddress, String dateOfBirth,
            int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Singer object using the no-argument constructor
        Singer singer1 = new Singer();

        // Display default values
        System.out.println("Default values for singer1:");
        displaySingerDetails(singer1);

        // Set values using the setter that sets all values
        singer1.setAllValues(1, "John Doe", "123 Main St", "1990-01-01", 5);

        // Display updated values
        System.out.println("\nValues after setting all at once:");
        displaySingerDetails(singer1);

        // Change values using individual setters
        singer1.setSingerName("Jane Doe");
        singer1.setSingerAddress("456 Oak St");
        singer1.setDateOfBirth("1985-05-15");
        singer1.setAlbumsPublished(8);

        // Display current values after changes
        System.out.println("\nCurrent values after individual changes:");
        displaySingerDetails(singer1);
    }

    // Helper method to display singer details
    private static void displaySingerDetails(Singer singer) {
        System.out.println("Singer ID: " + singer.getSingerId());
        System.out.println("Singer Name: " + singer.getSingerName());
        System.out.println("Singer Address: " + singer.getSingerAddress());
        System.out.println("Date of Birth: " + singer.getDateOfBirth());
        System.out.println("Albums Published: " + singer.getAlbumsPublished() + "\n");
    }
}
