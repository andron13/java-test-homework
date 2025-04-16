public class Homework38 {
    public static void main(String[] args) {
        int[] q1 = new int[]{2, 1, 2, 3, 4};
        int[] q2 = new int[]{2, 2, 0};
        int[] q3 = new int[]{1, 3, 5};
        System.out.println(countEvens(q1)); //→3
        System.out.println(countEvens(q2)); //→3
        System.out.println(countEvens(q3)); //→0

        int[] w1 = new int[]{1, 2, 1, 1, 3};
        int[] w2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] w3 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(w1)); //→ 4
        System.out.println(maxSpan(w2)); //→ 6
        System.out.println(maxSpan(w3)); //→ 6
    }

    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int maxSpan(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            count++;
        }
        return count;
    }
}