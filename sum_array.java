import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of rows");
        int r= sc.nextInt();
         System.out.println("enter number of col");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("the elements of array are");
        int sum=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 arr[i][j]=sc.nextInt();
                
            }
            
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum+=arr[i][j];
              
            }}
            
          System.out.println(sum);
    }
}
