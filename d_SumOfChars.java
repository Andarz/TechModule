package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class d_SumOfChars {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            char x =  keys.nextLine().charAt(0);
            sum = sum + x;

        }
        System.out.printf("The sum equals: %d", sum);
    }
}
