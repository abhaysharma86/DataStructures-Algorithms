package BasicLogicBuilding;

public class SwapTwoNumbers2 {

    public static void main(String[] args) {
        swapNumber(10,20);
    }

    private static void swapNumber(int n1, int n2)
    {
        System.out.println("a = "+n1 +" b = "+n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("a = "+n1 +" b = "+n2);
    }
}
