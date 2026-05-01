import java.util.Scanner;
public class primitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter number:");
            int num = sc.nextInt();

            System.out.print("Enter decimal number:");
            double price = sc.nextDouble();

            System.out.print("Enter grade:");
            char grade = sc.next().charAt(0);

            System.out.print("Enter true or false:");
            boolean status = sc.nextBoolean();
            
            System.out.println("integer:" + num);
            System.out.println("decimal:" + price);
            System.out.println("character:" + grade);
            System.out.println("Boolean:" + status);

        }
    }