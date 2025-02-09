package BasicLogicBuilding;

public class MultiplicationTable1 {
    public static void main(String[] args) {
        int value = 5;
        printTable(value);
    }

    public static void printTable(int input)
    {
        for(int i =1; i <= 10; i++)
        {
            System.out.println(input +" x "+ i +" = "+ input * i);
        }
    }
}
