package digits;

import java.util.ArrayList;
import java.util.List;

public class PlayDigits {

    public static void main(String[] args) {
        digPow(92, 1);
    }

    public static int digPow(int n, int p) {
        int expectedOutcome = n;

        char[] c = splitNumber(n);
        double total = 0;
        boolean check = false;
        int power = p;

        for (int i = 0; i < c.length; i++) {
            total = total + (Math.pow(Character.getNumericValue(c[i]), power));
            power = power + 1;
        }
        for (int i = 1; i < 100; i++) {
            expectedOutcome = expectedOutcome * i;
            if (total == expectedOutcome) {
                return (i);
            }
            expectedOutcome = n;

        }

        return (-1);
    }

    public static char[] splitNumber(int n) {

        String number = String.valueOf(n);

        return (number.toCharArray());
    }

}
