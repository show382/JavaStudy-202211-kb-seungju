package j05_조건;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int H;
        int M;
        int T;
        Scanner sc =new Scanner(System.in);
        H=sc.nextInt();
        M=sc.nextInt();
        T= sc.nextInt();
        if(H<0||H>24||M<0||M>60||T<0||T>1000){
            System.out.println("잘못된 값을 입력하셨습니다.");
        }else if ((T+M)>=60){
            System.out.println(((H+((T+M)/60)) +"   " +((T+M)%60)));
        }else {
            System.out.println(H +"   " +(M+T));

        }
    }
}
