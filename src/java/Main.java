package java;

public class Main {
    public static void main(String[] args){
        String string = "asd";
        isPalindrome(string)
    }
    public static boolean isPalindrome(String string) {
        char[] array = string.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return string.intern().equals(reversed.toString().intern());
    }
}
