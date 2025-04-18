package HW14;

public class DoubleChar {
    public static void main(String[] args) {
        doubleChar("The");      //→"TThhee"
        doubleChar("AAbb");     //→"AAAAbbbb"
        doubleChar("Hi-There"); //→"HHii--TThheerree"
    }

    /* 2. Given a string, return a string where for every char in the original, there are two chars.
    input - input data.*/

    public static String doubleChar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.substring(i, i + 1);
            output = output + output;
            System.out.print(output);
        }
        System.out.println();
        return output;
    }
}
