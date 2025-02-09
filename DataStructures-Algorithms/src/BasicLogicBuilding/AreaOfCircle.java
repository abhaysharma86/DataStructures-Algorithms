package BasicLogicBuilding;

import java.lang.Math;

class AreaOfCircle {
    static float findArea(float r) {
        return (float)(Math.PI * r * r);
    }

    public static void main(String[] args) {
        float r = 5;
        float area = findArea(r);
        System.out.printf("%.5f%n",area);
    }
}