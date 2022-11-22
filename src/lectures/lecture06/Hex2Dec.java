package lectures.lecture06;

public class Hex2Dec {

    public static int hexCharToDecimal(char c) {
        if (c >= 'A' && c <= 'F') {
            return 10 + c - 'A';
        }
        else {
            return c - '0';
        }
    }

    public static int hexToDecimal(String hex) {
        int result = 0;
        char[] chars = hex.toCharArray();

        for (int i=0; i<chars.length; i++) {
            result += (int) Math.pow(16, chars.length - (i+1)) * hexCharToDecimal(chars[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        String testValue = "AB8C";
        int decimal = hexToDecimal(testValue);

        System.out.println("Decimal value of " + testValue + " is " + decimal);
    }
}
