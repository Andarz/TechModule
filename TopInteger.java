package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int[] arr = Arrays.stream(keys.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isGreater = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isGreater = false;
                    break;
                }

            }
            if (isGreater) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
