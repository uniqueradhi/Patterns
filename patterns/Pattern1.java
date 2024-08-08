public class Pattern1 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            int num = i, dec = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += dec;
                dec--;
            }
            System.out.println();
        }
    }
}