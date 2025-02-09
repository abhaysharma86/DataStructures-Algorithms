package java8Features.lambda.lambdaExpressionParameter;

public class ReturnValue {

    public static boolean fecto(ReturnV v ,int a, int b){
        return v.factor(a, b);
    }

    public static void main(String[] args) {

        // one approach

//        boolean flag = fecto((a, b) -> {
//            return a % b == 0;
//        }, 10, 2);

        // second approach

        ReturnV returnV = (a,b) -> a%b==0;
        boolean flag = returnV.factor(10, 2);

        if(flag){
            System.out.println(true);
        }else
            System.out.println(false);

    }

}
interface ReturnV{
    boolean factor(int a, int b);
}
