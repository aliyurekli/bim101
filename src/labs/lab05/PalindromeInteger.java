package labs.lab05;

/**
 * Please refer to the task in material Lab #5
 */
public class PalindromeInteger {

    public static int reverse(int number) {
        int result = 0;
        int abs = Math.abs(number);
        int exponent = String.valueOf(abs).length();

        while (abs > 0) {
            int k = abs % 10;
            result += k * Math.pow(10, --exponent);
            abs = abs / 10;
        }

        return (Math.abs(number) == number) ? result : (-1 * result);
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {

        int[] tests = new int[] {-85328, -333, -5, 0, 8, 903, 10101, 88776};

        for (int t: tests) {
            System.out.printf("%d palindrome -> %s\n", t, isPalindrome(t));
        }
    }
}
