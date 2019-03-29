package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<String> input = Arrays.stream(keys.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int coins = 0;
        int room = 0;

        for (int i = 0; i < input.size(); i++) {
            String[] data = input.get(i).split("\\s+");
            String command = data[0];
            int number = Integer.parseInt(data[1]);
            room = 1 + i;

            if ("potion".equals(command)) {
                if (health + number <= 100) {
                    health += number;
                    System.out.println("You healed for " + number + " hp.");
                    System.out.println("Current health: " + health + " hp.");
                } else {
                    number = 100 - health;
                    System.out.println("You healed for " + number + " hp.");
                    health += number;
                    System.out.println("Current health: " + health + " hp.");
                }
                continue;
            }

            if ("chest".equals(command)) {
                coins += number;
                System.out.println("You found " + number + " coins.");
                continue;
            }

            if (!command.equals("chest")
                    && !command.equals("potion")
                        && health - number > 0) {
                health -= number;
                System.out.println("You slayed " + command + ".");
            } else {
                System.out.println("You died! Killed by " + command + ".");
                System.out.println("Best room: " + room);
                break;
            }

        }

        if (room == input.size()) {
            System.out.println("You've made it!");
            System.out.println("Coins: " + coins);
            System.out.println("Health: " + health);


        }
    }
}

