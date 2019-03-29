package AssociatedArraysExcercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        LinkedHashMap<String, String> registerList = new LinkedHashMap<>();

        int n = Integer.parseInt(keys.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = keys.nextLine().split("\\s+");
            String command = "";
            String userName = "";
            String licensePlateNumber = "";

            if (input.length == 3) {
                command = input[0];
                userName = input[1];
                licensePlateNumber = input[2];
            } else {
                command = input[0];
                userName = input[1];
            }

            if (command.equals("register")) {
                if (!registerList.containsKey(userName)) {
                    registerList.put(userName, licensePlateNumber);

                    System.out.println(String.format
                            ("%s registered %s successfully", userName, licensePlateNumber));
                } else {
                    System.out.println(String.format
                            ("ERROR: already registered with plate number %s", licensePlateNumber));
                }
            }

            if (command.equals("unregister")) {
                if (!registerList.containsKey(userName)) {
                    System.out.println(String.format
                            ("ERROR: user %s not found", userName));
                } else {
                    registerList.remove(userName);
                    System.out.println(String.format
                            ("%s unregistered successfully", userName));
                }
            }
        }

        registerList.forEach((key, value) ->
            System.out.println(String.format("%s => %s", key, value))
            );
    }
}
