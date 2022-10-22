package lesson_02;

public class HelloJava {
    public static void main(String[] args) {
        String string = " ";
        stringReverse(string);
        System.out.println("Hello world and Java World!");
    }
    public static String stringReverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
