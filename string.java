import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a string ");
        String str=sc.nextLine();
        int length= str.length();
        System.out.println("length="+ length);


        } } }