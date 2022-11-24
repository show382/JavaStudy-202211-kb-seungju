package j14_스태틱;

public class ProductMain {

    public static void show(){
        System.out.println("메인메소드에서 호출");
    }

    public static void main(String[] args) {
        Product product1 = new Product("아이폰 13mini");
        Product product2 = new Product("아이폰 14");

        System.out.println(product1);
        System.out.println(product2);

        product1.print();
        product2.print();
        Product.print();
        show();
    }
}
