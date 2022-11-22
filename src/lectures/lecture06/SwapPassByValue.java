package lectures.lecture06;

public class SwapPassByValue {

    public static void swap(int n1, int n2) {
        System.out.println("Before swapping, n1 is " + n1 + " and n2 is " + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping, n1 is " + n1 + " and n2 is " + n2);
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking swap method, num1 is " + num1 + " and num2 is " + num2);

        swap(num1, num2);

        System.out.println("After invoking swap method, num1 is " + num1 + " and num2 is " + num2);
    }
}
