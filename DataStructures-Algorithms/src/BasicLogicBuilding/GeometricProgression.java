package BasicLogicBuilding;

import java.util.Arrays;

public class GeometricProgression {

    public static void main(String[] args) {
        int a = 1,n = 10;
        float r = 0.5f;
        System.out.println(gP(a, r, n));
    }

    public static float gP(float a, float r, int n){

        float sum= 0;
        for(int i = 0; i < n; i++)
        {
            sum = sum + a;
            a = a*r;

        }
    return sum;
    }

}
