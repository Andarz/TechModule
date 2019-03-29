package AssociatedArraysExcercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        LinkedHashMap<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(keys.nextLine());


        for (int i = 0; i < n; i++) {
            String name = keys.nextLine();
            double grade = Double.parseDouble(keys.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }

            students.get(name).add(grade);
        }

        Map<String, Double> studentsAverage = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> kvp : students.entrySet()) {
            double averageGrade = kvp.getValue().stream()
                    .mapToDouble(d -> d).average().getAsDouble();

            if (averageGrade >= 4.50) {
                studentsAverage.put(kvp.getKey(), averageGrade);
            }
        }

        studentsAverage.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(grade -> {
                    System.out.println
                            (String.format("%s -> %.2f", grade.getKey(), grade.getValue()));
                });

    }
}

