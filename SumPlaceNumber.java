package HW14;

public class SumPlaceNumber {
    public static void main(String[] args) {
        sumPlaceNumber(123); // -> 6 (1+2+3)
        sumPlaceNumber(768); // -> 21 (7+6+8)
    }

/*  4. Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа,
    например:
            123 -> 6 (1+2+3)
            768 -> 21 (7+6+8)
    input - input number. */

    public static void sumPlaceNumber(int input) {
        String n0 = String.valueOf(input);
        int n1 = Integer.parseInt(n0.substring(0, 1));
        int n2 = Integer.parseInt(n0.substring(1, 2));
        int n3 = Integer.parseInt(n0.substring(2, 3));
        int output = n1 + n2 + n3;
        System.out.println(output);
    }
}
