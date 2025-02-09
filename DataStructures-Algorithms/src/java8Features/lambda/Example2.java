package java8Features.lambda;

import java.util.Arrays;
import java.util.List;

public class Example2{

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Mobile Phone", "Laptop", "Smart TV", "Computer", "Car", "Bike", "Cycle", "MotorCycle");
        Product1 product = (list)-> System.out.println(list);
        product.productInfo(list1);
        product.listOfProduct(list1);

    }
}
interface Product1{
    void productInfo(List<String> list);

    default void listOfProduct(List<String> productList){
        productList.stream().forEach(productname -> System.out.println(productname));
    }
}