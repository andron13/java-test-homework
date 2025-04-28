package HW18;

public class Loop2 {
    public static void main(String[] args) {
        loop2_1(5, 17);
        Loop1.split();
        loop2_2(5, 17);
        Loop1.split();
        loop2_3(5, 17);
    }

    //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
    private static void loop2_1(int A, int B) {
        for (int i = A + 1; i < B; i++) {
            System.out.println(i);
        }
    }

    private static void loop2_2(int A, int B) {
        while (A < B - 1) {
            A++;
            System.out.println(A);
        }
    }

    private static void loop2_3(int A, int B) {
        do {
            A++;
            System.out.println(A);
        }
        while (A < B - 1);
    }
}
