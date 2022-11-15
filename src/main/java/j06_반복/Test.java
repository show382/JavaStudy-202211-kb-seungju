package j06_반복;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        if (X > 10000000 || X < 1 || N < 1 || N > 100) {
            System.out.println("잘못된 값입니다.");
        } else {
            int total = 0;
            for (int i = 0; i < N; i++) {
                int ai = sc.nextInt();
                int bi = sc.nextInt();
                total += ai * bi;
            }
            boolean result = total == X;
            if (result) {

                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
