package java8Features.functionalInterfaces;

public class Functional_Interfaces_Before_Java_8 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running");
            }
        });
        thread.start();
    }

}
