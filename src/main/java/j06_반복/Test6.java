package j06_반복;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max =0;
        int index = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i+1;
            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}
