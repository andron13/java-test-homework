public class HwRecursion {
    public static void main(String[] args) {
        split(1);
        System.out.println(factorial(1));// → 1
        System.out.println(factorial(2)); //→ 2
        System.out.println(factorial(3)); // → 6
        split(2);
        System.out.println(bunnyEars2(0));// → 0
        System.out.println(bunnyEars2(1)); //→ 2
        System.out.println(bunnyEars2(2)); // → 5
        split(3);
        System.out.println(count7(717));//→ 2
        System.out.println(count7(7)); // → 1
        System.out.println(count7(123)); // → 0
        split(4);
        System.out.println(countX("xxhixx")); // → 4
        System.out.println(countX("xhixhix"));// → 3
        System.out.println(countX("hi")); // →0
        split(5);
        System.out.println(changePi("xpix")); //→"x3.14x"
        System.out.println(changePi("pipi")); //→"3.143.14"
        System.out.println(changePi("pip")); //→"3.14p"
        split(6);
        System.out.println(pairStar("hello")); //→ "hel*lo"
        System.out.println(pairStar("xxyy")); //→ "x*xy*y"
        System.out.println(pairStar("aaaa")); //→ "a*a*a*a"
        split(7);
        System.out.println(countAbc("abc")); //→ 1
        System.out.println(countAbc("abcxxabc")); //→ 2
        System.out.println(countAbc("abaxxaba")); //→ 2
        split(8);
        System.out.println(countHi2("ahixhi"));// → 1
        System.out.println(countHi2("ahibhi"));// → 2
        System.out.println(countHi2("xhixhi"));// → 0
        split(9);
        System.out.println(strCount("catcowcat", "cat")); //→ 2
        System.out.println(strCount("catcowcat", "cow")); //→ 1
        System.out.println(strCount("catcowcat", "dog"));// → 0
        split(10);
        System.out.println(bunnyEars(0)); //→ 0
        System.out.println(bunnyEars(1)); //→ 2
        System.out.println(bunnyEars(2)); //→ 4
    }
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int bunnyEars2(int bunnies) {
        if (bunnies >= 1) {
            if (bunnies % 2 == 0) {
                return 3 + bunnyEars2(bunnies - 1);
            } else {
                return 2 + bunnyEars2(bunnies - 1);
            }
        } else return 0;
    }

    public static int count7(int number) {
        if (number == 0) {
            return 0;
        }
        int lastNumber = number % 10;
        int temp = number / 10;
        if (lastNumber == 7) {
            return 1 + count7(temp);
        } else {
            return count7(temp);
        }
    }

    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        char firstChar = str.charAt(0);
        String rest = str.substring(1);
        if (firstChar == 'x') {
            return 1 + countX(rest);
        } else {
            return countX(rest);
        }
    }

    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

    public static String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }

    public static int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        String firstThree = str.substring(0, 3);
        if (firstThree.equals("abc") || firstThree.equals("aba")) {
            return 1 + countAbc(str.substring(1));
        } else {
            return countAbc(str.substring(1));
        }
    }

    public static int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.charAt(0) == 'x' && str.length() > 2 && str.substring(1, 3).equals("hi")) {
            return countHi2(str.substring(2));
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }

    public static int strCount(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return 0;
        }
        if (str1.startsWith(str2)) {
            return 1 + strCount(str1.substring(str2.length()), str2);
        }
        return strCount(str1.substring(1), str2);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies < 1) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public static void split(int task) {
        System.out.println("---------------" + "Task " + task + "------------------------");
    }
}

