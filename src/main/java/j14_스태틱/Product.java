package j14_스태틱;

import lombok.Data;

/*
    공유영역

 */
@Data
public class Product {
    private static  int autoIncrement = 20220000;

    private int serialNumber;
    public static String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }
    public static void print(){
        System.out.println(autoIncrement);
    }

}
