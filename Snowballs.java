package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        double snowballValue = 0;
        double maxSnowballValue = 0;


        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(keys.nextLine());
            int snowballTime = Integer.parseInt(keys.nextLine());
            int snowballQuality = Integer.parseInt(keys.nextLine());

            if (snowballTime > 0) {

                snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);
            }


            if (snowballValue > maxSnowballValue) {
                maxSnowballValue = snowballValue;

                System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, maxSnowballValue, snowballQuality);
            }


        }
    }
}
