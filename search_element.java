import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter rows");
        int r=sc.nextInt();
        System.out.println("enter cols");
        int c=sc.nextInt();
        System.out.println("enter number");
        int num=sc.nextInt();
        int arr[][]=new int [r][c];
        System.out.println("enter elements");
        int n=sc.nextInt();
         
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
               
            }}
            for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               
              if(arr[i][j]==num){
 System.out.println(n);

              }
            }}
              for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                 System.out.println(arr[i][j]);
            }
           
            
        }
    }}