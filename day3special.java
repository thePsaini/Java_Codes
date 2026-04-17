
import java.util.Scanner;

public class day3special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
         int count1 = 0;
         int count2 = 0;
        for (int i=1; i<=n; i++) {
            if (i%2==0) {
                count1++;
            }
            if (i%3!=0) {
                count2++;
            }

        }
        System.out.println(count1);
        System.out.println(count2);
    }
}