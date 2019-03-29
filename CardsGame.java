package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(keys.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> player2 = Arrays.stream(keys.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (player1.size() != 0 || player2.size() != 0) {

            int minIndex = Math.min(player1.size(), player2.size());


            for (int i = 0; i < minIndex - i; i++) {
                if (player1.get(i) == player2.get(i)) {
                    player1.remove(i);
                    player2.remove(i);

                } else if (player1.get(i) > player2.get(i)) {
                    player1.add(player1.get(i));
                    player1.add(player2.get(i));
                    player2.remove(i);

                } else {
                    player2.add(player2.get(i));
                    player2.add(player1.get(i));
                    player1.remove(i);
                }
            }
        }
        System.out.println();
    }
}
