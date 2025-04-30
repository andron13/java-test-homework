package HW19;

public class CheckString {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob")); //→ true
        System.out.println(bobThere("b9b")); //→ true
        System.out.println(bobThere("bac")); //→ false
    }

    private static boolean bobThere(String input) {
        char c0 = 'b';
        for (int i = 0; i < input.length(); i++) {
            if (c0 == input.charAt(i) && c0 == input.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }
}
