import java.util.Scanner;
public class userdetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter details of Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("\nEnter details of Student 2: ");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();

        System.out.println("\nStudent 1: ");
        System.out.println("Name:" + name1);
        System.out.println("Age:" + age1);
        System.out.println("Salary:" + salary1);

        System.out.println("\nStudent 2");
        System.out.println("Name:" + name2);
        System.out.println("Age:" + age2);
        System.out.println("Salary:" + salary2);

    }
}