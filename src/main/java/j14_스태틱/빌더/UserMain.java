package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
//        User user =User.builder()
//                .name("문승주")
//                .email("show382@naver.com")
//                .build();
//        System.out.println(user);

        Product product = Product.builder()
                .productName("Product")
                .productCode(1)
                .price(100)
                .stock(100)
                .build();
        System.out.println(product);

    }
}
