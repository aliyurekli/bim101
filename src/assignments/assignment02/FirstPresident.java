package assignments.assignment02;

import java.util.Random;

/**
 * Please refer to the material in Assignment #2
 */
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

        switch (year) {
            case 1881:
                System.out.printf("In %d, Mustafa was born in Salonika.", year);
                break;
            case 1893:
                System.out.printf("In %d, Mustafa was given the additional name Kemal at military school.", year);
                break;
            case 1919:
                System.out.printf("In %d, Mustafa Kemal landed in Samsun.", year);
                break;
            case 1923:
                System.out.printf("In %d, Mustafa Kemal was elected as the first president of the Republic of Turkey.", year);
                break;
            case 1932:
                System.out.printf("In %d, Mustafa Kemal founded the Turkish Linguistic Society.", year);
                break;
            case 1934:
                System.out.printf("In %d, the Grand National Assembly of Turkey granted him the surname Atatürk.", year);
                break;
            case 1938:
                System.out.printf("In %d, Atatürk died in Istanbul.", year);
                break;
            default:
                System.out.printf("One of his favorite sayings is \"%s\"", getRandomQuote());
                break;
        }
    }
}
