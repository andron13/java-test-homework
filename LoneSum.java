package HW14;

public class LoneSum {
    public static void main(String[] args) {
        loneSum(1, 2, 3); //→ 6
        loneSum(3, 2, 3); //→ 2
        loneSum(3, 3, 3); //→ 0
    }

    /* 3. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
    it does not count towards the sum.
    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0*/

    public static void loneSum(int a, int b, int c) {
        if (ifTrue(a, b, c)) System.out.println(0);
        else ifFalse(a, b, c);
    }

    // First case: a=b=c - return true.
    public static boolean ifTrue(int a, int b, int c) {
        if ((a / b) == 1 & (b / c) == 1) return true;
        else return false;
    }

    // Other cases: a = b  |  b = c  |  a = c  |  a != b != c
    public static void ifFalse(int a, int b, int c) {
        if (a == b) System.out.println(c);
        else if (b == c) System.out.println(a);
        else if (a == c) System.out.println(b);
        else System.out.println(a + b + c);
    }
}

