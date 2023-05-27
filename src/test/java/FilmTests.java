import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hm10.Film;
import ru.netology.hm10.FilmManager;


public class FilmTests {

    FilmManager manager = new FilmManager(5);


    @Test
    void shouldAdd() {
        FilmManager manager = new FilmManager(5);
        Film film1 = new Film(1, "Bloodshot", "1", "action");
        Film film2 = new Film(2, "Go", "2", "Animation");
        Film film3 = new Film(3, "Gentlemen", "3", "action");
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        Film[] expected = new Film[]{film3, film2, film1};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldEmpty() {
        FilmManager manager = new FilmManager(5);
        Film[] expected = new Film[]{};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void shouldNoFilm() {
        FilmManager manager = new FilmManager(5);
        Film[] expected = new Film[]{};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void shouldGetMovieQuantity() {
        FilmManager manager = new FilmManager(2);
        Film film1 = new Film(1, "Bloodshot", "1", "action");
        Film film2 = new Film(2, "Go", "2", "Animation");
        Film film3 = new Film(3, "Gentlemen", "3", "action");
        Film film4 = new Film(4, "Hotel", "4", "comedy");
        Film film5 = new Film(5, "Man the invisible ", "5", "horror");
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        Film[] expected = new Film[]{film5, film4};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldGetMovieQuantityLessThanLimit() {
        FilmManager manager = new FilmManager(3);
        Film film1 = new Film(1, "Bloodshot", "1", "action");
        Film film2 = new Film(2, "Go", "2", "Animation");
        manager.addFilm(film1);
        manager.addFilm(film2);
        Film[] expected = new Film[]{film2, film1};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldGetMovieQuantityMoreThanLimit() {
        FilmManager manager = new FilmManager(2);
        Film film1 = new Film(1, "Bloodshot", "1", "action");
        Film film2 = new Film(2, "Go", "2", "Animation");
        Film film3 = new Film(3, "Gentlemen", "3", "action");
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        Film[] expected = new Film[]{film3, film2};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void shouldGetMovieQuantityEqualToLimit() {
        FilmManager manager = new FilmManager(2);
        Film film1 = new Film(1, "Bloodshot", "1", "action");
        Film film2 = new Film(2, "Go", "2", "Animation");
        manager.addFilm(film1);
        manager.addFilm(film2);
        Film[] expected = new Film[]{film2, film1};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
