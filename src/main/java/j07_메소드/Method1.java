package j07_메소드;

import com.sun.source.tree.BreakTree;

public class Method1 {
    /**
     * 매개체 이어주는것
     * 리턴타입 메소드이름 (파라미터,매개변수){
     * 반환값(변수 or 상수)
     * }
     * 메서드를 정의한다고 표현한다
     * void 공허하다 비어있다 == 반환값이 없다
     */
    public static void method1() {
        System.out.println("메소드1 호출");
        System.out.println();
        method2(200);
    }

    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a:" + a);
        System.out.println();
    }

    public static int method3(int a, int b) {
        System.out.println("메서드3 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b =" + (a + b));
        System.out.println();
        return a + b;

    }

    public static int max(int a, int b) {
        int result = 0;

        if (a < b) {
            result = b;
        } else {
            result = a;
        }
        return result;
    }
        public static void main (String[]args){
            method1();
            System.out.println("메소드1 호출 후 출력");
            method2(10);
            int result1 = method3(3000, 7000);
            System.out.println("result1 : " + result1);
        }

    }
