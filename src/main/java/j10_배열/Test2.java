package j10_배열;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        String[] s = new String[t];
        for (int i = 0; i < t; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == 'o') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
