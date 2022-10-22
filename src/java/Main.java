package java;

public class Main {
    public static void main(String[] args){
        String p = "asd";
        isPalindrome(p)
    }
    public static boolean isPalindrome(String p) {
        char[] array = p.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {
            reversed.append(p.charAt(i));
        }
        return p.intern().equals(reversed.toString().intern());
    }
}
