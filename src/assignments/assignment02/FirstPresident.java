package assignments.assignment02;

import java.util.Random;

public class FirstPresident {

    private static final int[] YEARS = new int[] {
            1881, 1893, 1900, 1910, 1919, 1923, 1930, 1932, 1934, 1938
    };

    private static final String[] QUOTES = new String[] {
            "Teachers are the one and only people who save nations.",
            "Everything we see in the world is the creative work of women.",
            "Our true mentor in life is science.",
            "The future is in the skies.",
            "Peace at home, peace in the world."
    };

    private static int getRandomYear() {
        return YEARS[new Random().nextInt(YEARS.length)];
    }

    private static String getRandomQuote() {
        return QUOTES[new Random().nextInt(QUOTES.length)];
    }

    public static void main(String[] args) {
        int year = getRandomYear();

        // Write your code here below

    }
}
