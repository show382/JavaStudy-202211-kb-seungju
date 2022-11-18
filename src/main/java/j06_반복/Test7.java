package j06_반복;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] stdents = new int[31];
        for (int i = 0; i < 28; i++) {
            int success = sc.nextInt();
            stdents[success] = 1;
        }
        for (int i = 1; i < 31; i++) {
            if (stdents[i] != 1) {
                System.out.println(i);
            }
        }

    }
}
