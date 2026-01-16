package string;

public class SumNumbersString {
    public static void main(String[] args) {
        System.out.println(findSum("geeks4geeks"));
    }
    public static int findSum(String s) {
        int size = s.length();

        int sum = 0;
        int num = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                char ch = s.charAt(i);
                int in = ch - '0';
                num = num * 10 + in;
            }else{
                sum+=num;
                num = 0;
            }
        }
        sum+=num;
        return sum;
    }
}
