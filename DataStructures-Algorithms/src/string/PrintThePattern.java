package string;

public class PrintThePattern {
    public static void main(String[] args) {
        System.out.println(NumberPattern(5));
    }

    public static String[] NumberPattern(int n) {

        String[] result = new String[n];
        int idx = 0;

        // row 0
        result[idx++] = buildRow(0, n);

        // even rows
        for (int i = 2; i < n; i += 2) {
            result[idx++] = buildRow(i, n);
        }

        // odd rows reverse
        for (int i = n - 1; i >= 1; i--) {
            if (i % 2 == 1) {
                result[idx++] = buildRow(i, n);
            }
        }

        return result;
    }
    private static String buildRow(int row, int n) {

        StringBuilder sb = new StringBuilder();

        int start = row * n + 1;

        for (int col = 0; col < n; col++) {
            sb.append(start + col).append(" ");
        }

        return sb.toString();
    }
}
