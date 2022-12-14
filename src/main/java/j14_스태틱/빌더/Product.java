package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Product {
    private int productCode;
    private String productName;
    private int price;
    private int stock;

//    public static ProductBuilder productBuilder(){
//        return new ProductBuilder();
//    }
    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private int productCode;
        private String productName;
        private int price;
        private int stock;

        public ProductBuilder productCode(int productCode) {
            this.productCode = productCode;
            return this;
        }

        public ProductBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public ProductBuilder price(int price) {
            this.price = price;
            return this;
        }

        public ProductBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }
        public Product build() {
            return new Product(productCode, productName, price, stock);
        }
    }
}

