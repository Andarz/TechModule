package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class a_IntegerOperations {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int firstNumber = Integer.parseInt(keys.nextLine());
        int secondNumber = Integer.parseInt(keys.nextLine());
        int thirdNumber = Integer.parseInt(keys.nextLine());
        int fourthNumber = Integer.parseInt(keys.nextLine());

        int sum = firstNumber + secondNumber;
        int divide = sum / thirdNumber;
        int result = divide * fourthNumber;

        System.out.println(result);
    }
}
