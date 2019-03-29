package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniPlanning {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<String> lessonTitle = Arrays.stream(keys.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = keys.nextLine();

        while (!input.equals("course start")) {
            String[] data = input.split(":");
            String command = data[0];
            List<String> exercisePair = new ArrayList<>();

            switch (command) {
                case "Add":
                    if (!lessonTitle.contains(data[1])) {
                        lessonTitle.add(data[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    if (index >= 0 && index < lessonTitle.size()) {
                        if (!lessonTitle.contains(data[1])) {
                            lessonTitle.add(index, data[1]);
                        }
                    }
                    break;
                case "Remove":
                    if (lessonTitle.contains(data[1])) {
                        if (lessonTitle.get(lessonTitle.indexOf(data[1]) + 1).contains("-Exercise")) {
                            lessonTitle.remove(lessonTitle.indexOf(data[1]));
                            lessonTitle.remove(lessonTitle.indexOf(data[1]) + 1);
                        } else {
                        lessonTitle.remove(lessonTitle.indexOf(data[1]));
                        }
                    }
                    break;
                case "Swap":
                    if (lessonTitle.contains(data[1]) && lessonTitle.contains(data[2])) {
                        int index1 = lessonTitle.indexOf(data[1]);
                        int index2 = lessonTitle.indexOf(data[2]);
                        Collections.swap(lessonTitle, index1, index2);

                    }
                    break;
                case "Exercise":
                    String exercise = "";
                    int indexExercise = lessonTitle.indexOf(data[1]) + 1;

                    if (lessonTitle.contains(data[1])) {
                        exercise = String.format(data[1] + "-Exercise");
//                        exercisePair.add(data[1]);
//                        exercisePair.add(exercise);
                        lessonTitle.add(indexExercise, exercise);
                    } else {
                        exercise = String.format(data[1] + "-Exercise");
//                        exercisePair.add(data[1]);
//                        exercisePair.add(exercise);
                        lessonTitle.add(data[1]);
                        lessonTitle.add(exercise);
                    }
                    break;
            }

            input = keys.nextLine();
        }
        for (int i = 0; i < lessonTitle.size(); i++) {
            int indexForPrint = lessonTitle.indexOf(lessonTitle.get(i)) + 1;
            System.out.printf("%d.%s%n", indexForPrint, lessonTitle.get(i));
        }
    }
}
