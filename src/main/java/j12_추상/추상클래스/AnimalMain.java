package j12_추상.추상클래스;

import j11_상속.A;

import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal =null;

        while(true){
            String select = null;
            System.out.println("1 . 사람");
            System.out.println("2 . 호랑이");
            System.out.println("q . 종료");
            System.out.println("동물을 선택하세요>>>");
            select = sc.nextLine();
            if(select.equals("1")){
                animal = new Human("사람");
                }else if(select.equals("2")){
                    animal = new Tiger("호랑이");
                    }else if(select.equals("q")){
                        break;
                }else{
                System.out.println("다시 입력하세요.");
            }
            if(select.equals("1")||select.equals("2")){
                animal.move();
            }
            System.out.println();
}
        System.out.println("프로그램이 종료되었습니다.");
//        Animal animal = new Animal(); 추상 클래스는 생성 할 수 없다.
    }
}
