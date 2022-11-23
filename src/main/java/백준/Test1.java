package 백준;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum =0;
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            int[] n = new int[a[i]];
            a[i] = sc.nextInt();
            for (int j = 0; j < a[i]; j++){
                n[j] = sc.nextInt();
                sum += n[j];
            }
}
        System.out.println(sum);
        sc.close();
}
}
