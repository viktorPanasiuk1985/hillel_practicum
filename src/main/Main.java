package main;

public class Main {
    public static String stringReverse(String string) {
        char[] chars = string.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result +=  chars[i];
        }
        return result;
    }
    public void stringAlgorithm(String text) {
        System.out.println("Hello");
    }
}
