import java.util.Scanner;
public class inchtometer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in inches: ");
        double inches = sc.nextDouble();
        double meters = inches*0.0254;

        System.out.println("in meter: " + meters);
    }
}