package ru.netology.hm10;

public class FilmManager {
    private Film[] items = new Film[0];
    private int movieQuantity;

    public FilmManager(int movieQuantity) {
        this.movieQuantity = movieQuantity;
    }

    public void addFilm(Film item) {
        int resultLength = items.length + 1;
        Film[] tmp = new Film[resultLength];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] findAll() {

        Film[] result = new Film[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Film[] findLast() {
        int resultLength = movieQuantity;
        if (resultLength > items.length) {
            resultLength = items.length;
        }

        Film[] result = new Film[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}