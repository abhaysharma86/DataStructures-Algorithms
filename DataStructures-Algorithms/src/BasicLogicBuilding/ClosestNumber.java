package BasicLogicBuilding;

public class ClosestNumber {

    public static void main(String[] args) {
        closestNo(-15,6);
    }
    public static void closestNo(int n, int m)
    {
        int dif = n / m;
        int clo = m * dif;
        int abs = (n * m) > 0 ? (m * (dif + 1)) : (m * (dif - 1));
        if(Math.abs(n - clo) < Math.abs(n - abs)){
            System.out.println(clo);
        }else {
            System.out.println(abs);
        }

    }

}
