package j12_추상.추상클래스;

import j11_상속.A;

public class Human extends Animal{

    public  Human(String kind){
        super(kind);

    }

    @Override
    public void move() {
        System.out.println("사람이 움직인다.");
    }
}
