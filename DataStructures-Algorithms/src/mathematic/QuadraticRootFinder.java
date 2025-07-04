package mathematic;

public class QuadraticRootFinder {

    public static void main(String[] args) {
        int a = 1, b = -2, c = 1;

        int discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("-1");
        } else {
            // Real roots
            double sqrtD = Math.sqrt(discriminant);
            double root1 = (-b + sqrtD) / (2.0 * a);
            double root2 = (-b - sqrtD) / (2.0 * a);

            // Floor values
            int r1 = (int) Math.floor(root1);
            int r2 = (int) Math.floor(root2);

            // Print in decreasing order
            if (r1 >= r2) {
                System.out.println(r1 + " " + r2);
            } else {
                System.out.println(r2 + " " + r1);
            }
        }
    }

}
