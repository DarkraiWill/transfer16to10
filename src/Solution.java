public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimal) {
        if (decimal <= 0) {
            return "";
        }

        StringBuilder hexNumber = new StringBuilder();
        while (decimal != 0) {
            int remainder = decimal % 16;
            hexNumber.insert(0, HEX.charAt(remainder));
            decimal /= 16;
        }
        return hexNumber.toString();
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) {
            return 0;
        }

        int decimalNumber = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char hexChar = hexNumber.charAt(i);
            int hexValue = HEX.indexOf(Character.toLowerCase(hexChar));
            decimalNumber = 16 * decimalNumber + hexValue;
        }
        return decimalNumber;
    }
}
