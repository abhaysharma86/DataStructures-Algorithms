package BasicLogicBuilding;

public class SwapTwoNumbers1 {

    public static void main(String[] args) {
        swapNumber(2,3);
    }

    private static void swapNumber(int n1, int n2)
    {
        System.out.println("a = "+n1 +" b = "+n2);
        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("a = "+n1 +" b = "+n2);
    }
}
