package java8Features.functionalInterfaces;

public class ExampleWithRunnableInterface {

    public static void main(String[] args) {
        Runnable runnable = ()->System.out.println("Testing Runnable interface"); // Simple example for runnable
        runnable.run();

        Thread thread = new Thread(()-> System.out.println("thread executing")); // Thread example with runnable passing as parameter in thread constructor
        thread.start();

    }

}
