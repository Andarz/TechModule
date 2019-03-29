package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int[] input = Arrays.stream(keys.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxCount = 0;
        int bestIndex = 0;

        for (int i = 0; i < input.length; i++) {

            int currentCount = 0;

            for (int j = i; j < input.length ; j++) {
                if (input[i] == input[j]) {
                    currentCount++;

                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        bestIndex = i;
                    }
                } else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(input[i + bestIndex] + " ");

        }
    }
}
