package AssociatedArraysExcercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Map<String, List<String>> companies = new TreeMap<>();

        while (!"End".equals(input)) {
            String[] data = input.split(" -> ");
            String keyCompany = data[0];
            String user = data[1];

            if (!companies.containsKey(keyCompany)) {
                companies.put(keyCompany, new ArrayList<>());
            }

            if (!companies.get(keyCompany).contains(user)) {
                    companies.get(keyCompany).add(user);
            };

            input = reader.readLine();
        }

        companies.entrySet().stream()
                .forEach(kvp -> {
                    System.out.println(String.format("%s", kvp.getKey()));

                    kvp.getValue().forEach(u -> {
                        System.out.println(String.format("-- %s", u));
                    });
                });
    }
}
