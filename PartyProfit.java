package ExamPrep;

import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int partySize = Integer.parseInt(keys.nextLine());
        int daysCount = Integer.parseInt(keys.nextLine());

        int totalCoins = 0;

        for (int day = 1; day <= daysCount; day++) {
            if (day % 10 == 0) {
                partySize -= 2;
            }

            if (day % 15 == 0) {
                partySize += 5;
            }

            totalCoins += (50 - 2 * partySize);

            if (day % 3 == 0) {
                totalCoins -= (3 * partySize);
            }

            if (day % 5 == 0) {
                if (day % 3 == 0) {
                    totalCoins += (18 * partySize);
                } else {
                    totalCoins += (20 * partySize);
                }
            }
        }

        System.out.println(partySize + " companions received " +  totalCoins / partySize + " coins each.");

    }
}
