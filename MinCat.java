package HW14;

public class MinCat {
    public static void main(String[] args) {
        minCat("Hello", "Hi");   //→ "loHi"
        minCat("Hello", "java"); //→ "ellojava"
        minCat("java", "Hello"); //→ "javaello"
    }

    /*1. Given two strings, append them together (known as "concatenation") and return the result.
    However, if the strings are different lengths, omit chars from the longer string so it is the same
    length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
    input1, input2 - input data.
    */

    public static void minCat(String input1, String input2) {
        if (input1.length() == input2.length()) System.out.println(input1 + input2);
        else if (input1.length() > input2.length()) {
            int difference = input1.length() - input2.length();
            System.out.println(input1.substring(difference, input1.length()) + input2);
        } else if (input1.length() < input2.length()) {
            int difference = input2.length() - input1.length();
            System.out.println(input1 + input2.substring(difference, input2.length()));
        }
    }
}
