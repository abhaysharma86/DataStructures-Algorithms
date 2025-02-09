package BasicLogicBuilding;

public class SumNaturalNumbers2 {

    public static void main(String[] args) {
        printNumbers(5);
    }
    private static void printNumbers(int input)
    {
        System.out.println(input * (input+1) / 2);
    }
}
