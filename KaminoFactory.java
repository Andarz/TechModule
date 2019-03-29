package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        String input = keys.nextLine();

        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestSequenceIndexRow = 0;
        int bestSequenceIndexRowOutput = 0;
        String sequenceOutput = "";



        while (!input.equals("Clone them!")) {
            ++bestSequenceIndexRow;
            int[] dnaSequence = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();

            int maxCount = 0;
            int sequenceIndex = 0;


            for (int i = 0; i < dnaSequence.length; i++) {
                int count = 0;
                for (int j = i; j < dnaSequence.length; j++) {
                    if (dnaSequence[i] == dnaSequence[j]) {
                        count++;
                        if (count > maxCount) {
                            maxCount = count;
                            sequenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }

            int sequenceSum = 0;
            for (int aDnaSequence : dnaSequence) {
                if (aDnaSequence == 1) {
                    sequenceSum += aDnaSequence;
                }
            }

            if (sequenceIndex < bestSequenceIndex || sequenceSum > bestSequenceSum) {
                sequenceOutput = "";
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = sequenceSum;
                bestSequenceIndexRowOutput = bestSequenceIndexRow;
                for (int aDnaSequence : dnaSequence) {
                    sequenceOutput += aDnaSequence + " ";
                }
            }

            input = keys.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndexRowOutput, bestSequenceSum);
        System.out.println(sequenceOutput.trim());
    }
}
