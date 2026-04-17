
import java.util.Scanner;

public class day3threecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int count =0;
        for (int i=1; i<=n; i++) {
            if (i%15==0) {
        
        count++;
            }
     
    }
     System.out.println(count);
}
}
