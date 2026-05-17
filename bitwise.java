import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A: ");
        int a = sc.nextInt();
        System.out.print("Enter the number B: ");
        int b = sc.nextInt();
        System.out.println("a&b = " + (a&b));
        System.out.println("a|b = " + (a|b));
        System.out.println("a<<1 = " + (a<<1));
        System.out.println("a>>2 = " + (a>>2));
    }
}