package AssociatedArraysExcercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class Courses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, TreeSet<String>> courses = new LinkedHashMap<>();

        String input = reader.readLine();

        while (!"end".equals(input)) {
            String[] data = input.split(" : ");
            String keyCourseName = data[0];
            String valueRegisteredUsers = data[1];

            if (!courses.containsKey(keyCourseName)) {
                courses.put(keyCourseName, new TreeSet<>());

                if (!courses.get(keyCourseName).contains(valueRegisteredUsers)) {
                    courses.get(keyCourseName).add(valueRegisteredUsers);
                }

            } else {
                courses.get(keyCourseName).add(valueRegisteredUsers);
            }

            input = reader.readLine();
        }

        courses.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(),
                            e1.getValue().size());

                    return sort;
                }).forEach(kvp -> {
            System.out.println(String.format
                    ("%s: %s", kvp.getKey(), kvp.getValue().size()));

            kvp.getValue().forEach(u -> {
                System.out.println(String.format("-- %s", u));
            });

        });
    }
}
