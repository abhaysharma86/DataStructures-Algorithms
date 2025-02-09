package BasicLogicBuilding;

public class SumNaturalNumbers1 {

    public static void main(String[] args) {
        printNumbers(5);
    }
    private static void printNumbers(int input)
    {
        int sum = 0;
        StringBuffer message = new StringBuffer();
       for(int i = 1; i <= input; i++)
       {
           message.append(i);
           if(i < input)
               message.append(" + ");
           sum = i + sum;
       }
        System.out.println(message +" = "+ sum);
    }
}
