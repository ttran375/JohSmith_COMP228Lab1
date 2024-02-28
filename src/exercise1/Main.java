package exercise1;

public final class Main {
    public static void main(final String[] args) {
        final int initialAlbums = 5;
        final int updatedAlbums = 5;
        Singers singer1 = new Singers();

        System.out.println("Default values for singer1:");
        displaySingerDetails(singer1);

        singer1.setAllValues(
                1,
                "John Doe",
                "123 Main St",
                "1990-01-01",
                initialAlbums);

        System.out.println("\nValues after setting all at once:");
        displaySingerDetails(singer1);

        singer1.setSingerName("Jane Doe");
        singer1.setSingerAddress("456 Oak St");
        singer1.setDateOfBirth("1985-05-15");
        singer1.setAlbumsPublished(updatedAlbums);

        System.out.println("\nCurrent values after individual changes:");
        displaySingerDetails(singer1);
    }

    private static void displaySingerDetails(final Singers singer) {
        System.out.println("Singer ID: " + singer.getSingerId());
        System.out.println("Singer Name: " + singer.getSingerName());
        System.out.println("Singer Address: " + singer.getSingerAddress());
        System.out.println("Date of Birth: " + singer.getDateOfBirth());
        System.out.println(
                "Albums Published: "
                        + singer.getAlbumsPublished()
                        + "\n");
    }
}

class Singers {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    Singers() {
    }

    Singers(
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
