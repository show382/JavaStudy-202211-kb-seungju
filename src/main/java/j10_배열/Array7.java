package j10_배열;


public class Array7 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i] + (i != a.length - 1 ? ", " : ""));
        }

        int[] b = a;//주소가 같아 진것이다

        if(a==b){
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }
        System.out.println("[배열 b]");
        b[3]=10;
        for (int i = 0;i<a.length;i++){
            System.out.print(b[i] + (i != b.length - 1 ? ", " : "\n"));
}
        if(a==b){
            System.out.println("같다");
        }else {
            System.out.println("다르다");
        }
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i] + (i != a.length - 1 ? ", " : ""));
        }
    }
}

