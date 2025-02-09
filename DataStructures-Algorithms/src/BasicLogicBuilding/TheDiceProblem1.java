package BasicLogicBuilding;

public class TheDiceProblem1 {
    public static void main(String[] args) {
        diceProblem(3);
    }
    private static void diceProblem(int n)
    {
        int res = n == 1 ? 6 : n == 2 ? 5 : n == 3 ? 4 : n == 4 ? 3 : n == 5 ? 2 : 1;
        System.out.println(res);
    }
}
