public class rhombus {
    public static void main(String[] args) {
        int n = 4, space = n - 1, num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print(num + "   ");
                num++;
            }
            space -= 1;
            System.out.println();
        }
    }

}
