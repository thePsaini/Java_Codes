import java.util.Scanner;

public class sum_matrix {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("enter row: ");
            int r = sc.nextInt();

            System.out.print("enter column: ");
            int c = sc.nextInt();

            int a[][] = new int[r][c];
            int b[][] = new int[r][c];
            int sum[][] = new int[r][c];

            System.out.println("enter elements of matrix a");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("enter elements of matrix b");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("sum of matrices:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}