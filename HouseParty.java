package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        List<String> names = new ArrayList<>();

        while (n-- > 0) {
            String[]  data = keys.nextLine().split("\\s+");

            if (data[2].equals("not")) {
                if (!names.contains(data[0])) {
                    System.out.printf("%s is not in the list!\n", data[0]);
                }
                names.remove(data[0]);
            } else {
                if (names.contains(data[0])) {
                    System.out.printf("%s is already in the list!\n", data[0]);
                } else {
                    names.add(data[0]);
                }
            }
        }
        System.out.println(String.join("\n", names));
    }
}
