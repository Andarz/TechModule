package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int firstNumber = Integer.parseInt(keys.nextLine());
        int secondNumber = Integer.parseInt(keys.nextLine());
        int thirdNumber = Integer.parseInt(keys.nextLine());

        int minElement = min(firstNumber, secondNumber);
        System.out.println(Math.min(minElement, thirdNumber));
    }

    static int min(int first, int second) {
        return Math.min(first, second);
    }
}
