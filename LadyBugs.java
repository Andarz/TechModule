package ArraysExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int fieldSize = Integer.parseInt(keys.nextLine());
        int[] ladybugs = new int[fieldSize];

        int[] ladybugIndices = Arrays.stream(keys.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .filter(e -> e >= 0 && e < fieldSize)
                .toArray();

        for (int i = 0; i < ladybugIndices.length; i++) {
            ladybugs[ladybugIndices[i]] = 1;
        }

        String input = "";

        while (!"end".equals(input = keys.nextLine())) {
            String[] commandLine = input.split(" ");

            int ladybugIndex = Integer.parseInt(commandLine[0]);
            String direction = commandLine[1];
            int flyLenght = Integer.parseInt(commandLine[2]);

            if (ladybugIndex >= 0 && ladybugIndex < ladybugs.length
                    && ladybugs[ladybugIndex] == 1) {

                ladybugs[ladybugIndex] = 0;


                while (true) {
                    switch (direction) {
                        case "left":
                            ladybugIndex -= flyLenght;
                            break;
                        case "right":
                            ladybugIndex += flyLenght;
                            break;
                    }

                    if (ladybugIndex < 0 || ladybugIndex >= fieldSize) {
                        break;
                    }

                    if (ladybugs[ladybugIndex] == 1) {
                        continue;

                    }

                    if (ladybugs[ladybugIndex] == 0) {
                        ladybugs[ladybugIndex] = 1;
                        break;


                    }
                }
            }
        }

        System.out.println(Arrays.stream(ladybugs).mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}