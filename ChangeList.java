package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<Integer> data = Arrays.stream(keys.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = keys.nextLine();

        while (!"end".equals(input)) {
            String[] token = input.split("\\s+");

            if (token.length == 3) {
                int element = Integer.parseInt(token[1]);
                int index = Integer.parseInt(token[2]);
                if (index > data.size() - 1) {
                    break;
                }
                data.add(index, element);

            } else {
                int element = Integer.parseInt(token[1]);
                for (int i = 0; i < data.size(); i++) {
                    if (data.get(i) == element) {
                        data.remove(i);

                    }
                }
            }
            input = keys.nextLine();
        }
        System.out.println(data.toString().replaceAll("[\\[,\\]]", ""));
    }
}
