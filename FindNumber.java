package HW13;

public class FindNumber {
    public static void main(String[] args) {
        findNumbers();
    }

    /* Программа находит число/-а меньше 3000. При делении этого числа/-ел на 32 получается
    остаток 30, при делении на 58 - остаток 44.*/
    public static void findNumbers() {
        for (int i = 3000; i > 0; i--) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }
}