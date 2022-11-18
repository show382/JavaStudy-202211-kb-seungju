package j10_배열;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomArray = new int[10];
        int sum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rand.nextInt(10)+1;
            System.out.print(randomArray[i]);
            if(i!=randomArray.length-1){
                System.out.print(", ");
            }
            sum += randomArray[i];
        }
        System.out.println();
        System.out.println("총합:"+sum);
    }
}
