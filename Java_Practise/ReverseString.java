package Java_Practise;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}