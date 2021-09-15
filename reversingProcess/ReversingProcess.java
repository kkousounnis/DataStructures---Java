package reversingaprocess;

import java.util.ArrayList;
import java.util.List;

public class ReversingProcess {

    public static void main(String[] args) {
        String r = "1877138eieaqgumigywmicwgcgg";
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; 
        String x = "";
        String result = "";
        String value = "";

        for (int i = 0; i < r.length(); i++) {
            if (Character.isDigit(r.charAt(i))) {
                x = x + r.charAt(i);
            } else {
                value = value + r.charAt(i);

            }
        }
        System.out.println(value);
        for (int i = 0; i < value.length(); i++) {
            int num = alphabet.indexOf(value.charAt(i));
            int calculate = (num * Integer.parseInt(x) % 26);

            for (int j = 0; j < alphabet.length(); j++) {

                if (Integer.parseInt(x) * j % 26 == num) {
                    System.out.println("key:" + Integer.parseInt(x) + "*" + "j:" + j + "% 26");
                    result += alphabet.charAt(j);
                }
            }

        }

        System.out.println(result);
        if (result.length() != value.length()) {
            System.out.println("Impossible to decode!!");
        }else{
            System.out.println(result);
        }
    }   

}

