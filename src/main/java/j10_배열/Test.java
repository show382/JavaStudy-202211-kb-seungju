package j10_배열;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] q = new double[n];
        double Total = 0.0;
        double x = 0;
        for (int i = 0; i <n; i++) {
             q[i] = sc.nextInt();
        }
        double max = q[0];
        for (int i = 0; i < n; i++) {
            if(max<q[i]){
                max =q[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < n; i++) {
            q[i] = (q[i]/max)*100;
            System.out.println(q[i]);
            Total += q[i];
        }
        x = Total/n;
        System.out.println(x);
    }
}
