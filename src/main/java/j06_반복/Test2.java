package j06_반복;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
        int ai = sc.nextInt();
        int bi = sc.nextInt();
        int sum = ai + bi;
            System.out.println("Case #"+(i+1+":"+ sum));

    }

    }

}
