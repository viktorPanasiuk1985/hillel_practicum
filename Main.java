public class Main {
    public static String stringReverse(String str) {
        char[] reversed = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            reversed[reversed.length - i - 1] = str.charAt(i);
        }
        return String.valueOf(reversed);
    }
}
