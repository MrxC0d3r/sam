import java.util.Scanner;

class MovieMagic {
    // Instance variables
    private int year;
    private String title;
    private float rating;

    // Default constructor
    public MovieMagic() {
        this.year = 0;
        this.title = "";
        this.rating = 0.0f;
    }

    // Method to accept the movie details
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of release: ");
        this.year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the title of the movie: ");
        this.title = scanner.nextLine();

        System.out.print("Enter the rating of the movie (0.0 to 5.0): ");
        this.rating = scanner.nextFloat();

        // Ensure the rating is within the valid range
        if (this.rating < 0.0f || this.rating > 5.0f) {
            System.out.println("Invalid rating. Please enter a rating between 0.0 and 5.0.");
            this.rating = 0.0f; // Reset to default
        }
    }

    // Method to display the movie details and rating message
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Year of Release: " + this.year);
        System.out.println("Rating: " + this.rating);

        if (this.rating >= 0.0f && this.rating <= 2.0f) {
            System.out.println("Message: Flop");
        } else if (this.rating >= 2.1f && this.rating <= 3.4f) {
            System.out.println("Message: Semi-hit");
        } else if (this.rating >= 3.5f && this.rating <= 4.5f) {
            System.out.println("Message: Hit");
        } else if (this.rating >= 4.6f && this.rating <= 5.0f) {
            System.out.println("Message: Super Hit");
        } else {
            System.out.println("Invalid rating.");
        }
    }

    // Main method to create an object and call the methods
    public static void main(String[] args) {
        MovieMagic movie = new MovieMagic();
        movie.accept();
        movie.display();
    }
}
