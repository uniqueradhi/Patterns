public class ZOHOFINANCE {
    public static void main(String[] args) {
        String s = "ZOHOFINANCE";
        int n = s.length();
        int x = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(s.charAt(i));
                } else if (j == x) {
                    System.out.print(s.charAt(x));

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            x--;

        }

    }

}
