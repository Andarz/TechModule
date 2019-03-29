package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class h_BeerKegs {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        double volume = 0;
        double maxVolume = 0;
        String modelMaxVolume = "";

        for (int i = 0; i < n; i++) {
            String model = keys.nextLine();
            double radius = Double.parseDouble(keys.nextLine());
            int height = Integer.parseInt(keys.nextLine());


            volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                modelMaxVolume = model;
            }
        }
        System.out.println(modelMaxVolume);
    }
}
