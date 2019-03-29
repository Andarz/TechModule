package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<String> quests = Arrays.stream(keys.nextLine().split(", "))
                .collect(Collectors.toList());

        String data = keys.nextLine();

        while (!data.equals("Retire!")) {
            String[] tokens = data.split(" - ");
            String command = tokens[0];
            String quest = tokens[1];

            switch (command) {
                case "Start":

                    if (!quests.contains(quest)) {
                        quests.add(quest);
                    }
                    break;

                case "Complete":
                    quests.remove(quest);

                    break;
                case "Side Quest":
                    String[] sideQuest = quest.split(":");

                    if (quests.contains(sideQuest[0])) {
                        if (!quests.contains(sideQuest[1])) {
                            quests.add(quests.indexOf(sideQuest[0]) + 1, sideQuest[1]);
                        }
                    }
                    break;
                case "Renew":

                    if (quests.contains(quest)) {
                        quests.remove(quest);
                        quests.add(quest);
                    }
                    break;
            }

            data = keys.nextLine();
        }

        System.out.println(String.join(", ", quests));
    }
}
