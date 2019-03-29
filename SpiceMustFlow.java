package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int startingYield = Integer.parseInt(keys.nextLine());

        int days = 0;
        int profitEndOfTheDay = 0;
        int totalProfit = 0;

        if (startingYield < 100) {
            System.out.println(days + "\n" + totalProfit);
        } else {

            while (startingYield >= 100) {
                profitEndOfTheDay = startingYield - 26;
                totalProfit += profitEndOfTheDay;
                days++;
                startingYield -= 10;
            }

            totalProfit -= 26;
            System.out.println(days);
            System.out.println(totalProfit);
        }
    }
}
