package j12_추상.인터페이스;

public class CalcMain {
    public static void main(String[] args) {
        int[] taxPay = {0, 0, 0, 0,};
        int[] calaryPay = {1000000, 1000000, 1000000, 1000000};

        int result1 = 0;
        int result2 = 0;

        Calculator calculator = new Tax();
        result1 = calculator.calc(taxPay);//taxPay 대신 (new int[]  = {2000000, 2500000, 2600000, 2700000, }) 이렇게도 된다 new int[] 를 써줘야 인식한다;
        if (result1 == 0) {
            System.out.println("오류: " + calculator.ERROR_CODE);
        }else{
        System.out.println("result1 =>" + result1);
        }

        calculator = new Salary();
        result2 = calculator.calc(calaryPay);
        if (result2 == 0) {
            System.out.println("오류: " + Calculator.ERROR_CODE);//static 클래스라서 생성 없이 가능
        }else {
            System.out.println("result2 =>" + result2);
        }


    }
}
