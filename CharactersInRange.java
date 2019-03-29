package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        char char1 = keys.next().charAt(0);
        char char2 = keys.next().charAt(0);

        if (char2 > char1) {

            for (int i = char1 + 1; i < char2; i++) {

                System.out.print((char) i + " ");

            }
        }else{
            for (int i = char2 + 1; i < char1; i++) {

                System.out.print((char) i + " ");

            }
        }
    }
}
