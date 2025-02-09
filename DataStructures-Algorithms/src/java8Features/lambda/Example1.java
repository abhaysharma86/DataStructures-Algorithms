package java8Features.lambda;

import java.util.Arrays;
import java.util.List;

public class Example1{

    // why introduced lambda expression
    Product product=new Product() {
        @Override
        public void productInfo(List<String> products) {
            System.out.println("Executing Product Details");
            listOfProduct(products);
        }
    };

    public static void main(String[] args) {
      Example1 example1 = new Example1();
      example1.product.productInfo(Arrays.asList("Mobile Phone","Laptop","Smart TV","Computer","Car","Bike","Cycle","MotorCycle"));

    }
}

abstract class Product{

    public abstract void productInfo(List<String> list);

    public void listOfProduct(List<String> productList){
        int i =1;
        for (String productName : productList) {
            System.out.println(i + " : " + productName);
            i++;
        }
    }
}