package java8Features.lambda.lambdaExpressionParameter;

public class ReturnValue {

    public static boolean fecto(ReturnV v ,int a, int b){
        return v.factor(a, b);
    }

    public static void main(String[] args) {

        boolean fecto = fecto((a, b) -> {
            return a % b == 0;
        }, 10, 2);
        if(fecto){
            System.out.println(true);
        }else
            System.out.println(false);

    }

}
interface ReturnV{
    boolean factor(int a, int b);
}
