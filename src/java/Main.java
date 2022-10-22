package java;

public class Main {
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
