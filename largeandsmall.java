import java.util.Scanner;
public class largeandsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        int largest, smallest;
        if (a>=b&&a>=c)
        largest = a;
        else if (b>=a&&b>=c)
        largest = b;
        else 
        largest = c;

        if (a<=b&&a<=c)
        smallest = a;
        else if (b<=a&&b<=c)
        smallest = b;
        else 
        smallest = c;
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}