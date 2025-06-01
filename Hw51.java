import java.util.Arrays;

public class Hw51 {

    public static void main(String[] args) {
        split(1);
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));          // [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));       // [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));                // [0, 1]

        split(2);
        System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));   // [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2})));               // [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2})));               // [2, 2, 2]
    }

    public static void split(int task) {
        System.out.println("---------------" + "Task " + task + "------------------------");
    }

    public static int[] zeroFront(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[zeroIndex];
                nums[zeroIndex] = temp;
                zeroIndex++;
            }
        }
        return nums;
    }

    public static int[] evenOdd(int[] nums) {
        int evenIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[evenIndex];
                nums[evenIndex] = temp;
                evenIndex++;
            }
        }
        return nums;
    }
}
