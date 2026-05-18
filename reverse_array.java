import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int r=sc.nextInt();
        System.out.println("enter number of cols");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter elements");
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                 arr[i][j]=sc.nextInt();
                
            }
            
        }
         for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
               
                int num=arr[i][j];
                 int reverse=0;
 while (num != 0) {

            int digit = num % 10;     
            reverse = reverse * 10 + digit;
           num = num / 10;           
        }
System.out.println(reverse + " ");
    }
    System.out.println();
   


    }
}
}