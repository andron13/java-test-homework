package HW13;

public class PrimeNumber {

    public static void main(String[] args) {
        printPrimeNumber(100);
    }

    // Программа находит простые числа в диапазоне от 2 до range.
    public static void printPrimeNumber(int range) {
        for (int i = 2; i < range; i++) {
            if (primeNumbers(i)) {
                System.out.println(i + " - простое число");
            }
        }
    }

    public static boolean primeNumbers(int checkNumber) {
        for (int i = 2; i < checkNumber; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}