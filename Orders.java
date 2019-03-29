package AssociatedArraysExcercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> remProduct = new LinkedHashMap<>();

        String input = keys.nextLine();

        while (!"buy".equals(input)) {
            String[] data = input.split(" ");

            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!orders.containsKey(product)) {
                orders.put(product, quantity * price);
                remProduct.put(product, quantity);
            } else {
                remProduct.put(product, remProduct.get(product) + quantity);
                orders.put(product, remProduct.get(product) * price);
            }

            input = keys.nextLine();
        }

        orders.forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key, value)));
    }
}

