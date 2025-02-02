package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);
        Movie terminatirMovie = new Movie("Terminator", "Top");
        Movie matrixMovie = new Movie("Matrix", "Cool");
        movieService.add(terminatirMovie);
        movieService.add(matrixMovie);
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
    }
}
