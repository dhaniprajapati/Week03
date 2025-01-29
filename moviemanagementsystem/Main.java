package linkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieLinkedList movieList = new MovieLinkedList();

        // Adding Bollywood movies
        movieList.addAtEnd("3 Idiots", "Rajkumar Hirani", 2009, 8.4);
        movieList.addAtBeginning("Dilwale Dulhania Le Jayenge", "Aditya Chopra", 1995, 8.1);
        movieList.addAtPosition(1, "Sholay", "Ramesh Sippy", 1975, 8.2);

        // Display all movie records in forward and reverse order
        System.out.println("Bollywood Movies in forward order:");
        movieList.displayForward();

        System.out.println("Bollywood Movies in reverse order:");
        movieList.displayReverse();

        // Update a movie's rating
        movieList.updateRatingByTitle("3 Idiots", 8.5);

        // Searching for a movie by director
        MovieNode movie = movieList.searchByDirector("Rajkumar Hirani");
        if (movie != null) {
            System.out.println("Found movie by Rajkumar Hirani: " + movie.title);
        } else {
            System.out.println("Movie not found");
        }

        // Searching for a movie by rating
        movie = movieList.searchByRating(8.5);
        if (movie != null) {
            System.out.println("Found movie with rating 8.5: " + movie.title);
        } else {
            System.out.println("Movie not found");
        }

        // Remove a movie by title
        movieList.removeByTitle("Sholay");

        // Display all movie records in forward and reverse order after removal
        System.out.println("Bollywood Movies in forward order after removal:");
        movieList.displayForward();

        System.out.println("Bollywood Movies in reverse order after removal:");
        movieList.displayReverse();
    }
}

