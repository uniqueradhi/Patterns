public class Palindrome_Triangle2 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.print("0 ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            if (i > 0) {
                System.out.print("0 ");
            }

            System.out.println();
        }
    }
}
