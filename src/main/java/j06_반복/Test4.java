package j06_반복;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count=0;
        int[] q = new int[n];
        int i = 0;
        for(i = 0; i < n; i++) {
            q[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        for(i=0;i<q.length;i++) {
            if(q[i]==x) {
                count++;
            }

        }
        System.out.println(count);
    }
}
