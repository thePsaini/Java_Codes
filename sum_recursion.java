import java.util.Scanner;
public class sum_recursion {
    static int sum (int n){
        if(n==1)   {
            return 1;
         }
        return n + sum (n-1);
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("enter n");
            int n = sc.nextInt();
            int result =sum(n);
            System.out.println("sum of first"+ n +" numbers=" + result );
        }
    }
}