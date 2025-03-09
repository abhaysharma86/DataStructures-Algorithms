package java8Features.lambda.createThreadUsingLambdaExpressions;

public class Example1 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            Thread.currentThread().setName("Test Thread");
            System.out.println(Thread.currentThread().getName() + " Is Running");
        };
        Thread thread= new Thread(runnable);
        thread.start();
    }
}
