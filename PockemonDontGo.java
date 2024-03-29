package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PockemonDontGo {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<Integer> elements = Arrays.stream(keys.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        while (elements.size() > 0) {
            int index = Integer.parseInt(keys.nextLine());
            int element = 0;

            if (index < 0) {
                element = elements.get(0);
                elements.set(0, elements.get(elements.size() - 1));
            } else if (index >= elements.size()) {
                element = elements.get(elements.size() - 1);
                elements.set(elements.size() - 1, elements.get(0));
            } else {
                element = elements.get(index);
                elements.remove(index);
            }

            sum += element;

            increaseOrDecreaseElements(elements, element);
        }

        System.out.println(sum);


    }

    private static void increaseOrDecreaseElements(List<Integer> elements, int element) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i) <= element) {
                elements.set(i, elements.get(i) + element);
            } else {
                elements.set(i, elements.get(i) - element);
            }
        }
    }
}
