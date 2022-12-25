package lectures.lecture09;

import java.util.Random;

/**
 * Please refer to the course material slide #9
 */
public class RandomWithSeed {

    public static void main(String[] args) {

        Random random1 = new Random(5);
        System.out.print("Numbers from random1: ");
        for(int i=0; i<10; i++) {
            System.out.print(random1.nextInt(50) + " ");
        }

        Random random2 = new Random(5);
        System.out.print("\nNumbers from random2: ");
        for(int i=0; i<10; i++) {
            System.out.print(random2.nextInt(50) + " ");
        }
    }
}
