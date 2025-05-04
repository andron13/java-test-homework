package HW15;

public class CheckMethods {
    public static void main(String[] args) {
        System.out.println(contains("Alyona"));  // --> true
        System.out.println(contains("Alexandr"));  // --> true
        System.out.println(contains("Anton"));  // --> false
        split ();
        System.out.println(stringEndsWith("activist"));  // --> true
        System.out.println(stringEndsWith("marxist"));  // --> true
        System.out.println(stringEndsWith("spring"));  // --> false
        split ();
        System.out.println(equals("apple"));  // --> true
        System.out.println(equals("Apple"));  // --> false
        System.out.println(equals("apples"));  // --> false
        split ();
        System.out.println(equalsIgnoreCase("apple"));  // --> true
        System.out.println(equalsIgnoreCase("ApplE"));  // --> true
        System.out.println(equalsIgnoreCase("apples"));  // --> false
        split ();
        System.out.println(isEmpty("apple"));  // --> false
        System.out.println(isEmpty("ApplE"));  // --> false
        System.out.println(isEmpty(""));  // --> true
        split ();
        System.out.println(length("Remarcble"));  // --> 9
        System.out.println(length("prohibition"));  // --> 11
        System.out.println(length("one"));  // --> 3
        System.out.println(length(""));  // --> 0
        split ();
        System.out.println(replace("apple"));  // --> opple
        System.out.println(replace("ApplE"));  // --> ApplE
        System.out.println(replace("activist"));  // --> octivist
        split ();
        System.out.println(startsWith("apple"));  // --> true
        System.out.println(startsWith("Apple"));  // --> false
        System.out.println(startsWith("apples"));  // --> true
        split ();
        System.out.println(substring("apple"));  // --> le
        System.out.println(substring("Apple"));  // --> le
        System.out.println(substring("apples"));  // --> les
        split();
        System.out.println(toLowerCase("apple"));  // --> apple
        System.out.println(toLowerCase("ApPle"));  // --> apple
        System.out.println(toLowerCase("APPLES"));  // --> apples
        split();
        System.out.println(toUpperCase("apple"));  // --> APPLE
        System.out.println(toUpperCase("ApPle"));  // --> APPLE
        System.out.println(toUpperCase("aPPLes"));  // --> APPLES
        split();
        System.out.println(trim("     apple !!!  "));  // --> apple !!!
        System.out.println(trim("  ApPle          ApPle  "));  // --> ApPle          ApPle
        System.out.println(trim(" aPPLes           "));  // --> aPPLes
        split();
    }

    public static boolean contains(String input) {
        return input.contains("Al");
    }

    public static boolean stringEndsWith(String input) {
        return input.endsWith("ist");
    }

    public static boolean equals(String input) {
        return input.equals("apple");
    }

    public static boolean equalsIgnoreCase(String input) {
        return input.equalsIgnoreCase("apple");
    }

    public static boolean isEmpty(String input) {
        return input.isEmpty();
    }

    public static int length(String input) {
        return input.length();
    }

    public static String replace(String input) {
        return input.replace("a", "o");
    }

    public static boolean startsWith(String input) {
        return input.startsWith("app");
    }

    public static String substring(String input) {
        return input.substring(3);
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();    }

    public static String trim(String input) {
        return input.trim();
    }

    public static void split() {
        System.out.println("----------------------");
    }
}
