public class HW49 {

    public static void main(String[] args) {
        System.out.println(array11(new int[]{1, 2, 11}, 0));
        System.out.println(array11(new int[]{11, 11}, 0));
        System.out.println(array11(new int[]{1, 2, 3, 4}, 0));

        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));
    }

    public static int array11(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return (numbers[index] == 11 ? 1 : 0) + array11(numbers, index + 1);
    }

    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        } else {
            return str.charAt(0) + pairStar(str.substring(1));
        }
    }
}
