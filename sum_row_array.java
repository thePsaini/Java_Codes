import java.util.Scanner;

public class sum_row_array{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter number of rows ");
        int r=sc.nextInt();
        System.out.println("enter  number of columns ");
        int c=sc.nextInt();
        int arr[][]=new int [r][c];
      
        System.out.println("enter elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                  arr[i][j]=sc.nextInt();
            }}
           for (int i = 0; i < r; i++) {
            int sum=0;
            for (int j = 0; j < c; j++) {
            sum+=arr[i][j];
            
            
        }
        
            System.out.println("sum: " + sum);
            
        }
        System.out.println( );
    }
}