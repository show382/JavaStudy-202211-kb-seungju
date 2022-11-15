package j02_변수;

/**
 * 클래스에 대한 설명~~
 * 메소드에 대한 설명~~ 별 두개
 */

public class Variable {
    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " + checkFlag);
/*
 그냥 중간에 쓴다 별 한개
 */
        char nanme1 = '문';
        char name2 = '승';
        char name3 = '주';
        System.out.println("" + nanme1 + name2 + name3);
        System.out.println(Integer.toHexString(nanme1));
        System.out.println("\uae40");

        int width = 100;
        int width2 = 200;

        System.out.println(width + width2);
        String sWidth = "100";
        String sWidth2 = "200";
        System.out.println(sWidth2 + sWidth);

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum2 + dNum);

        System.out.println("<<<형변환>>>");
        // 업캐스팅
        // 문자 -> 정수 -> 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int) c1) + 10);
        int n1 = (int) c1;
        System.out.println(n1);
        double d1 = (double) n1;
        System.out.println(d1);

        // 다운 캐스팅
        // 실수 -> 정수 -> 문자
        int n2 = (int) d1;
        System.out.println(n2);
        char c2 = (char) n2;
        System.out.println(c2);
    }


}

