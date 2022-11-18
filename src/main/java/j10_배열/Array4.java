package j10_배열;

import java.util.Random;

public class Array4 {
    public static int foundMinNumber(int[] numbers){
        int min = numbers[0];
        for(int i = 0 ; i < numbers.length ; i++){
            if(min>numbers[i]){
                min = numbers[i];
            }
        }

        return min;
    }
    public static int foundMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];

            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        int total = 0;
        Random random = new Random();
        for (int i = 0; i < randomArray.length;i++) {
            while (true) {
            int randomNumber = random.nextInt(10) + 1;
            boolean found = true;
                for (int j = 0; j < randomArray.length; j++) {
                    if (randomArray[j] == randomNumber) {
                        found = false;
                    }
                }
                if (found) {
                    randomArray[i] = randomNumber;
                    break;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if(i!=randomArray.length-1){
                System.out.print(", ");
            }
            sum += randomArray[i];
        }
        System.out.println();
        System.out.println("총합:"+sum);
        System.out.println("최소값 :" + foundMinNumber(randomArray));
        System.out.println("최대값 :" + foundMaxNumber(randomArray));
    }
    }

