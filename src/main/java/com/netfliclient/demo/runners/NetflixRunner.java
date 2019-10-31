package com.netfliclient.demo.runners;

import com.netfliclient.demo.feign.NetflixFeign;
import com.netfliclient.demo.model.Category;
import com.netfliclient.demo.model.Movie;
import com.netfliclient.demo.model.MovieSuggestion;
import com.netfliclient.demo.model.Subscriber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class NetflixRunner implements CommandLineRunner {
    private final NetflixFeign netflixFeign;
    private final Random random = new Random();

    public NetflixRunner(NetflixFeign netflixFeign) {
        this.netflixFeign = netflixFeign;
    }

    @Override
    public void run(String... args) throws Exception {
        String[] movieTypes = new String[]{"suggested", "original"};
        // Register Subscriber
        Subscriber latestAccount = netflixFeign.newSubscriber(
                new Subscriber("331247", "Hello From The Other Side")
        );

        System.out.println("Latest Account: " + latestAccount.toString());

        // Fetch all movie categories
        List<Category> allCategories = netflixFeign.allCategories();

        for (Category c : allCategories) {
            System.out.println("Category " + c.getId() + ": " + c.getCategoryName());
        }

        // Fetch all movies
        List<Movie> allMovies = netflixFeign.allMovies();

        for (Movie m : allMovies) {
            System.out.println("Movie " + m.getId() + ": " + m.toString());
        }

        // Fetch category movies
        List<Movie> allNewSubMovies = netflixFeign.categoryMovies(
                Integer.toUnsignedLong(allCategories.get(
                        random.nextInt(allCategories.size())
                ).getId()),
                movieTypes[random.nextInt(movieTypes.length)]
        );

        System.out.println("Categorized Movies");
        for (Movie m : allMovies) {
            System.out.println("Movie " + m.getId() + ": " + m.toString());
        }

        // Suggest movie
        Movie suggestedMovie = netflixFeign.suggestMovie(
                latestAccount.getIdentificationNumber(),
                new MovieSuggestion("Sound of Music", "2003", allCategories.subList(0, 2))
        );

        System.out.println("Suggested Movie: " + suggestedMovie.toString());

        // Subscriber movies
        List<Movie> subscriberMovies = netflixFeign.subscriberMovies(
                Integer.toUnsignedLong(latestAccount.getId())
        );

        System.out.println("All Subscriber Movies");
        for (Movie m : subscriberMovies) {
            System.out.println("Movie " + m.getId() + ": " + m.toString());
        }

        // Update movie
        Movie updatedMovie = netflixFeign.updateMovie(
                latestAccount.getIdentificationNumber(),
                Integer.toUnsignedLong(suggestedMovie.getId()),
                new MovieSuggestion("No Longer Sound of Music", "2005", allCategories.subList(0, 2))
        );

        System.out.println("Updated Movie: " + updatedMovie.toString());

        // Delete the updated movie
        netflixFeign.deleteMovie(latestAccount.getIdentificationNumber(), Integer.toUnsignedLong(suggestedMovie.getId()));
        System.out.println("This movie was deleted");

    }
}
