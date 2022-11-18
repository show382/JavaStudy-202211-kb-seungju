package j09_접근지정자.캡슐화;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
        for(int i=0; i<6; i++) {
            System.out.println(rand.nextInt(45)+1);
        }
    }
}
