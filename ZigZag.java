package ArraysExercise;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());

        String[] nums = new String[n * 2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            String[] input = keys.nextLine().split(" ");
            if (i % 2 == 0) {
                nums[index++] = input[0];
                nums[index++] = input[1];
            } else {
                nums[index++] = input[1];
                nums[index++] = input[0];
            }


        }
        String firstOutput = "";
        String secondOutput = "";

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                firstOutput += nums[i] + " ";
            } else {
                secondOutput += nums[i] + " ";
            }

        }
        System.out.println(firstOutput);
        System.out.println(secondOutput);
    }
}
