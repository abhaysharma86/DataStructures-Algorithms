package java8Features.functionalInterfaces.consumerInterface;

import java8Features.functionalInterfaces.consumerInterface.exception.ValidationException;

import javax.naming.InvalidNameException;
import java.util.function.Consumer;

public class MultipleOperationsExample {

    Consumer<Customer> customerValidation = customer -> {
        String name = customer.getName();
        String pho = customer.getPhoneNo();
        try {
            if (!name.startsWith("A") || !name.endsWith("a")) {
                throw new InvalidNameException("Validation is failed with Name, name is not start with 'A' and end with 'A'" + name);
            } else if (pho.length() < 10 || pho.length() > 10) {
                throw new InvalidNameException("Phone no validation is failed. please check phone no length " + pho.length());
            }
            System.out.println("Customer Data is validated successfully...");
        } catch (InvalidNameException e) {
            throw new ValidationException(e.getMessage(), e.getStackTrace());
        }
    };

    Consumer<Customer> sendTheEmailNotificationTotTheCustomer = emailNotification -> {
        System.out.println("Email send to the customer " + emailNotification.getName());
    };

    Consumer<Customer> saveCustomer = savecustomer -> {
        System.out.println("Customer MetaData is saved in DB successfully...");
    };

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Abhay sharma");
        customer.setAddress("Gurugram Haryana");
        customer.setPhoneNo("1234568291");

        MultipleOperationsExample obj = new MultipleOperationsExample();

        try {
            Consumer<Customer> customerConsumer = obj.customerValidation.andThen(obj.sendTheEmailNotificationTotTheCustomer).andThen(obj.saveCustomer);
            customerConsumer.accept(customer);
        } catch (ValidationException e) {
            e.printStackTrace();
        }
    }

}
