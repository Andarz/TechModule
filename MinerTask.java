package AssociatedArraysExcercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        String input = "";

        LinkedHashMap<String, Integer> resources = new
                LinkedHashMap<>();


        while (!"stop".equals(input = keys.nextLine())) {
            String resource = input;
            int value = Integer.parseInt(keys.nextLine());

            if (!resources.containsKey(resource)) {
                resources.put(resource, value);
            } else {
                resources.put(resource, resources.get(resource) + value);
            }
        }

        resources.entrySet().forEach(e -> {
            System.out.println(String.format("%s -> %d", e.getKey(), e.getValue()));
        });
    }
}
