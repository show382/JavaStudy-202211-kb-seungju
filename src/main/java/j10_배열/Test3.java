package j10_배열;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
            int total = 0;
            float average = 0;
            float cnt = 0;
            float result = 0;
            float[] v = new float[m[i]];
            for (int j = 0; j < m[i]; j++) {
                v[j] = sc.nextInt();
                total += v[j];
            }
            for (int j = 0; j < m[i]; j++) {
            }
            average = total / m[i];
            for (int j = 0; j < m[i]; j++) {
                if (v[j] > average) {
                    cnt += 1;
                } else {
                    cnt = cnt;
                }
            }
            result = cnt / m[i] * 100;
            System.out.println();
            System.out.println(result);

        }
                sc.close();
    }
}
