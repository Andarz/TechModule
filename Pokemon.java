package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);

        int N = Integer.parseInt(keys.nextLine());
        int M = Integer.parseInt(keys.nextLine());
        int Y = Integer.parseInt(keys.nextLine());

        int count = 0;
        double half = (N * 50) / 100;

        while (N >= M) {
            count++;
            N -= M;

            if (half == N) {
                if (Y > 0) {

                    N /= Y;
                }
            }

        }
        System.out.println(N);
        System.out.println(count);
    }
}
