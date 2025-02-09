package BasicLogicBuilding;

public class EvenOrOdd_1 {

    public static void main(String[] args) {
        int value = 5;
        System.out.println(findEvenOrOdd(value) ? true : false);
    }

    private static boolean findEvenOrOdd(int input)
    {
        return (input % 2 == 0);
    }

}
