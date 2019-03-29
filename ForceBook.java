package AssociatedArraysExcercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class ForceBook {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        LinkedHashMap<String, TreeSet<String>> forceBook =
                new LinkedHashMap<>();

        String input = "";

        while (!"Lumpawaroo".equals(input = keys.nextLine())) {
            String[] data =
                    Arrays.stream(input
                            .split("\\s+\\|\\s+|\\s+->\\s+"))
                            .toArray(String[]::new);

            if (input.contains("|")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                final boolean[] found = {false};

                forceBook.forEach((key, value) -> {
                    if (value.contains(forceUser)) {
                        found[0] = true;
                        return;
                    }
                });

                if (!found[0]) {
                    forceBook.get(forceSide).add(forceUser);
                }

            } else {
                String forceUser = data[0];
                String forceSide = data[1];

                forceBook.forEach((key, value) -> value.remove(forceUser));

                forceBook.get(forceSide).add(forceUser);

                System.out.printf("%s joins the %s side!\n", forceUser, forceSide);
            }
        }

        forceBook.entrySet().stream()
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(),
                            e1.getValue().size());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }

                    return  sort;
                }).forEach(kvp -> {
            System.out.println(String.format
                    ("Side: %s, Members: %d", kvp.getKey(), kvp.getValue().size()));

            kvp.getValue().forEach(u -> {
                System.out.println(String.format("! %s", u));
            });
        });
    }
}
