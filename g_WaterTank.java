package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class g_WaterTank {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        int sum = 0;
        int capacity = 255;

        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(keys.nextLine());

            if (sum + quantity > capacity) {
                System.out.println("Insufficient capacity!");

            }else{
                sum += quantity;
            }

        }
        System.out.println(sum);
    }
}
