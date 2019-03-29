package ExamPrep;

import java.util.*;

import static java.util.Collections.sort;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int n = Integer.parseInt(keys.nextLine());
        int[] codes = new int[n];
        int sum = 0;
        int charCode = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            String name = keys.nextLine();
            for (int j = 0; j < name.length(); j++) {

                if (isVowel(name.charAt(j))) {
                    charCode = name.charAt(j) * name.length();
                } else {
                    charCode = name.charAt(j) / name.length();
                }

                sum += charCode;

                codes[i] = sum;
            }
        }

        List<Integer> codesAsList = new ArrayList<>();
        for (int code : codes) {
            codesAsList.add(code);
        }

        Collections.sort(codesAsList);

        codesAsList.forEach(System.out::println);
    }

    static boolean isVowel(char symbol) {
        switch (symbol) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'o':
            case 'O':
            case 'i':
            case 'I':
            case 'u':
            case 'U':
                return true;
        }
        return false;
    }
}
