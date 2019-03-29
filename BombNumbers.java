package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(keys.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] token = Arrays.stream(keys.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int bomb = token[0];
        int power = token[1];
        int sum = 0;

        while (numbers.contains(bomb)) {
            int bombNumberIndex = numbers.indexOf(bomb);
            int leftLimit = Math.max(0, bombNumberIndex - power);
            int rightLimit = Math.min(bombNumberIndex + power, numbers.size() - 1);

            for (int i = rightLimit; i >= leftLimit ; i--) {
                numbers.remove(i);

            }

            }
            for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);


    }
}
