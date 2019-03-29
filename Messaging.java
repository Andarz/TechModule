package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(keys.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        
        String text = keys.nextLine();

        for (int i = 0; i < numbers.size(); i++) {
            
        }
    }
}
