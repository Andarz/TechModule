package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<String> elements = Arrays.stream(keys.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = keys.nextLine();

        while (!input.equals("3:1")) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "merge":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    startIndex = validateIndex(startIndex, elements.size());
                    endIndex = validateIndex(endIndex, elements.size());
                    String concatElements =
                            String.join("", elements.subList(startIndex, endIndex));
                    elements.subList(startIndex, endIndex).clear();
                    elements.add(startIndex, concatElements);
                    break;
                case "divide":
                    break;
            }

            input = keys.nextLine();

        }



    }

    private static int validateIndex(int index, int length) {
        if (index < 0) {
            index = 0;
        }

        if (index > length - 1) {
            index = length - 1;
        }

        return index;
    }
}
