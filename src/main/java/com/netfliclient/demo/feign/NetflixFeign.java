package com.netfliclient.demo.feign;

import com.netfliclient.demo.model.Category;
import com.netfliclient.demo.model.Movie;
import com.netfliclient.demo.model.MovieSuggestion;
import com.netfliclient.demo.model.Subscriber;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "subscribers", url = "http://localhost:9000", configuration = FeignConfig.class)
public interface NetflixFeign {
    @RequestMapping(method = RequestMethod.POST, value = "subscribers")
    Subscriber newSubscriber(@RequestBody Subscriber subscriber);

    @RequestMapping(method = RequestMethod.GET, value = "categories")
    List<Category> allCategories();

    @RequestMapping(method = RequestMethod.GET, value = "movies")
    List<Movie> allMovies();

    @RequestMapping(method = RequestMethod.GET, value = "categories/{categoryId}/movies?type={movieType}")
    List<Movie> categoryMovies(@PathVariable Long categoryId, @PathVariable String movieType);

    @RequestMapping(method = RequestMethod.POST, value = "subscribers/{identificationNumber}/movies")
    Movie suggestMovie(@PathVariable String identificationNumber, @RequestBody MovieSuggestion movieSuggestion);

    @RequestMapping(method = RequestMethod.GET, value = "subscribers/{subscriberId}/movies")
    List<Movie> subscriberMovies(@PathVariable Long subscriberId);

    @RequestMapping(method = RequestMethod.PATCH, value = "subscribers/{identificationNumber}/movies/{movieId}")
    Movie updateMovie(@PathVariable String identificationNumber, @PathVariable Long movieId, @RequestBody MovieSuggestion movieSuggestion);

    @RequestMapping(method = RequestMethod.DELETE, value = "subscribers/{identificationNumber}/movies/{movieId}")
    void deleteMovie(@PathVariable String identificationNumber, @PathVariable Long movieId);

}
