package j13_Object;

import java.util.Scanner;

public class StringTest {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Integer i = 100;
        Object o = new Object();
        String  str1 = "걓ㅇ";
        String  str2 = "걓ㅇ";
        String  str3 = new String("걓ㅇ");
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str3));
    }

}
