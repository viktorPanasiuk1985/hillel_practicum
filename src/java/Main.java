package java;

public class Main {
    public static String stringReverse(String string) {
        char[] chars = string.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result +=  chars[i];
        }
        return result;
    public stringAlgoritm(String text) {
        System.out.println("Hello");
    }
    public String stringReverse(String str) {
        char[] srcArr = str.toCharArray();
        char[] trgArr = str.toCharArray();
        int max = str.length() - 1;

        for (int i = max; i >= 0; i--) {
            trgArr[max - i] = srcArr[i];
        }

        return new String(trgArr);
    }
}
