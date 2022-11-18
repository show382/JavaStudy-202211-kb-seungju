package j08_클래스;

public class PhoneMain {

    public static void main(String[] args) {

        Phone iPhone13 = new Phone();
        Phone galaxyS22 = new Phone();
        iPhone13.model = "13 Series";
        iPhone13.company = "Apple";
        galaxyS22.company = "SAMSUNG";
        System.out.println(iPhone13);
        iPhone13.printPhoneCompany();
        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneCompany();
        iPhone13.printPhoneModel();
    }
}
