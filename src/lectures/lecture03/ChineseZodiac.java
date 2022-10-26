package lectures.lecture03;

import java.util.Scanner;

/**
 * Please refer to the course material slide #3
 */
public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year value");
        int year = scanner.nextInt();

        String chinese = null;
        switch (year % 12) {
            case 0 :
                chinese = "Monkey";
                break;
            case 1 :
                chinese = "Rooster";
                break;
            case 2 :
                chinese = "Dog";
                break;
            case 3 :
                chinese = "Pig";
                break;
            case 4 :
                chinese = "Rat";
                break;
            case 5 :
                chinese = "Ox";
                break;
            case 6 :
                chinese = "Tiger";
                break;
            case 7 :
                chinese = "Rabbit";
                break;
            case 8 :
                chinese = "Dragon";
                break;
            case 9 :
                chinese = "Snake";
                break;
            case 10 :
                chinese = "Horse";
                break;
            case 11 :
                chinese = "Sheep";
                break;
        }

        System.out.printf("The year %d is %s in Chinese Zodiac.", year, chinese);
    }
}
