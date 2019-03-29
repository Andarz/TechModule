package AssociatedArraysExcercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SoftuniExamResults {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<Integer>> results = new LinkedHashMap<>();
        ArrayList<String> lang = new ArrayList<>();

        String input = reader.readLine();

        while (!"exam finished".equals(input)) {
            String[] data = input.split("-");

            if (data.length == 3) {
                String keyUsername = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                if (!results.containsKey(keyUsername)) {
                    results.put(keyUsername, new ArrayList<>());
                }

                results.get(keyUsername).add(points);

                lang.add(language);
            } else {
                String userToBan = data[0];
            }







            input = reader.readLine();
        }
        System.out.println();
    }
}
