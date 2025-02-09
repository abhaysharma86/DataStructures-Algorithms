package BasicLogicBuilding;

class SimpleInterest {
    static float simpleInterest(float p, float t, float r) {
        return (p * t * r) / 100;
    }

    public static void main(String[] args) {
        float p = 1, r = 1, t = 1;
        System.out.println(simpleInterest(p, r, t));
    }
}