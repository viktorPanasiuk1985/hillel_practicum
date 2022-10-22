package java;

public class Main {

    public static String stringReverse(String string) {
        char[] chars = string.toCharArray();
        String res = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            res = res + chars[i];
        }
        return res;
    }
}
