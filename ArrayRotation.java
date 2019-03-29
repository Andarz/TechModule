package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        String[] numbers = keys.nextLine().split(" ");
        int rotations = Integer.parseInt(keys.nextLine());

        for (int i = 0; i < rotations; i++) {

            String firstElement = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }

            numbers[numbers.length - 1] = firstElement;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
