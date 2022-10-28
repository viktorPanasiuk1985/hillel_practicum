package java;

public class Main {

    public static boolean isPalindrome(String string) {
        StringBuilder newString = new StringBuilder(string).reverse();
        return string.equalsIgnoreCase(String.valueOf(newString));
    }
}
