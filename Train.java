package ListsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        System.in
                                )
                        );

        List<Integer> wagons = Arrays.stream(reader.readLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(reader.readLine());
        String input = reader.readLine();


        while (!"end".equals(input)) {

            String[] token = input.split("\\s+");

            if(token.length == 2) {
                int number = Integer.parseInt(token[1]);
                wagons.add(number);
            } else {
                int number = Integer.parseInt(token[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);

                    if (currentWagon + number <= maxCapacity) {
                        wagons.set(i, currentWagon + number);
                        break;
                    }
                }
            }

            input = reader.readLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[,\\]]", ""));
    }
}
