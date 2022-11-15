package j05_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("점수를 입력하세요: ");
            int score = sc.nextInt();
            if (score <= 0 || score > 100) {
                System.out.println("잘못된 점수 입니다");
            } else if (score >= 90) {
                System.out.println("A학점 입니다");
            } else if (score >= 80) {
                System.out.println("b학점 입니다");
            } else if (score >= 70) {
                System.out.println("c학점 입니다");
            } else if (score >= 60) {
                System.out.println("d학점 입니다");
            } else {
                System.out.println("F학점 입니다.");
            }
        }
    }
}
