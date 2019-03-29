package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        String input1 = keys.nextLine();
        String input2 = keys.nextLine();
        String[] elements1 = input1.split(" ");
        String[] elements2 = input2.split(" ");

        for (int i = 0; i < elements2.length; i++) {
            for (int j = 0; j < elements1.length; j++) {
                if (elements1[j].equals(elements2[i])) {
                    System.out.print(elements2[i] + " ");
                }
            }
        }
    }
}
