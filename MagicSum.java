package ArraysExercise;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        String[] numbers = keys.nextLine().split(" ");
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        int controlSum = Integer.parseInt(keys.nextLine());


        for (int i = 0; i < nums.length; i++) {

            int goalPosition = 0;

            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums [j];

                if (controlSum == sum) {
                    goalPosition = nums[j];
                    System.out.print(nums[i] + " ");
                    System.out.println(goalPosition);
                }
            }
        }
    }
}
