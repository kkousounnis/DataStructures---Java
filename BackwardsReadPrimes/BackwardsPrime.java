package javaapplication2;

public class BackwardsPrime {

    public static void main(String[] args) {

        System.out.println(backwardsPrime(2, 100));
    }

    static String backwardsPrime(long start, long end) {
        String answer = "";
        for (long i = start; i <= end; i++) {
            if (isPrime(i) && (i > 10)
                    && (reverseNumber(i) != i) && isPrime(reverseNumber(i))) {
                if (answer.isEmpty()) {
                    answer = String.valueOf(i);
                } else {
                    answer = answer + " " + i;
                }
            }
        }
        return (answer);
    }

    static boolean isPrime(long n) {
        for (long i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long reverseNumber(long number) {
        long reverse = 0;
        while (number != 0) {
            long remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return (reverse);
    }

}
