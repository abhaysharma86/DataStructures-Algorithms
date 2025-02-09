package BasicLogicBuilding;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        int value = 5;
        printTable(value, 1);
    }

    public static void printTable(int input, int i)
    {
        if(i > 10 )
            return;

        System.out.println(input +" x "+ i +" = "+ input*i);
        printTable(input,i+1);
    }
}
