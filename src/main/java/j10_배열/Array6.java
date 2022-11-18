package j10_배열;


public class Array6 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 8, 9, 16, 17};
        int[] nums2 = new int[]{2, 7, 10, 15, 18};
        int[] nums3 = new int[]{3, 6, 11, 14, 19};
        int[] nums4 = new int[]{4, 5, 12, 13, 20};
        /*
        (동일 인덱스)
        첫열에 최소값
        두쨋열에 최소값
        .
        . 각 최소값들로 새 배열을 출력
         */
        int a = 10;
        int b = 5;
        int c = 7;

        int min = a;
        if (a < b) {
            min = a;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("min: " + min);
    }

}

