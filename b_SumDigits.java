package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class b_SumDigits {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int number = Integer.parseInt(keys.nextLine());
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println(sum);
    }
}
