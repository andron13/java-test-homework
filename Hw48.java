public class Hw48 {

    public static void main(String[] args) {
        int count = 3;
        hanoiRing('A', 'B', 'C', count);
    }

    public static void hanoiRing(char a, char b, char c, int count) {

        if (count == 1) {
            System.out.printf("из стержня %s на стержень %s%n", a, b);
        } else {
            hanoiRing(a, c, b, count - 1);
            System.out.printf("из стержня %s на стержень %s%n", a, b);
            hanoiRing(c, b, a, count - 1);
        }
    }
}
