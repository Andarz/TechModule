package MethodsExercise;

import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        String[] inputData = keys.nextLine().split("\\s+");

        int[] numbers = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            numbers[i] = Integer.parseInt(inputData[i]);

        }
        String input = "";
    }
}
