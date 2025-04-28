package HW18;

public class Loop1 {
    public static void main(String[] args) {
        loop1_1(6, 3);
        split();
        loop1_2(8, 4);
        split();
        loop1_3(3, 11);
    }

    //Даны целые числа A и B, где B > 0. Вывести B раз число A.
    private static void loop1_1(int A, int B) {
        int i = 0;
        while (i < A) {
            System.out.println(B);
            i++;
        }
    }

    private static void loop1_2(int A, int B) {
        for (int i = 0; i < A; i++) {
            System.out.println(B);
        }
    }

    private static void loop1_3(int A, int B) {
        int i = 0;
        do {
            System.out.println(B);
            i++;
        } while (i < A);
    }

    public static void split () {
        System.out.println("-----");
    }
}
