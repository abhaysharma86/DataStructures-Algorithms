package BasicLogicBuilding;

public class EvenOrOdd_2 {

    public static void main(String[] args) {
        int value = 6;
        System.out.println(findEvenOrOdd(value) ? true : false);
    }

    private static boolean findEvenOrOdd(int input)
    {
        return ((input & 1) == 0);
    }

}
