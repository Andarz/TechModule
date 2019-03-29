package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class e_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int firstNumber = Integer.parseInt(keys.nextLine());
        int secondNumber = Integer.parseInt(keys.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {

            char x = (char) i;

            System.out.printf("%c ", x);

        }
    }
}
