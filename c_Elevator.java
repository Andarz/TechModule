package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class c_Elevator {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        int p = Integer.parseInt(keys.nextLine());

        int courses = (int) Math.ceil((double) n / p);

        System.out.println(courses);
    }
}
