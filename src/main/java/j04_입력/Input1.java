package j04_입력;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        sc.nextBoolean();
        sc.nextLine();
        String phone = sc.nextLine();
        String address = sc.nextLine();
//boolean  a= f

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소 :" + address);


    }
}
