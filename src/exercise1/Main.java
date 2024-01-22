package src.exercise1;

public class Main {
    public static void main(String[] args) {
        Singers singer1 = new Singers();

        System.out.println("Default values for singer1:");
        displaySingerDetails(singer1);

        singer1.setAllValues(1, "John Doe", "123 Main St", "1990-01-01", 5);

        System.out.println("\nValues after setting all values at once:");
        displaySingerDetails(singer1);

        singer1.setSingerId(2);
        singer1.setSingerName("Jane Smith");
        singer1.setSingerAddress("456 Oak St");
        singer1.setDateOfBirth("1995-05-15");
        singer1.setNumOfAlbumsPublished(8);

        System.out.println("\nValues after changing values using individual setters:");
        displaySingerDetails(singer1);
    }

    private static void displaySingerDetails(Singers singer) {
        System.out.println("Singer ID: " + singer.getSingerId());
        System.out.println("Singer Name: " + singer.getSingerName());
        System.out.println("Singer Address: " + singer.getSingerAddress());
        System.out.println("Date of Birth: " + singer.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer.getNumOfAlbumsPublished());
        System.out.println("------------------------------");
    }
}
