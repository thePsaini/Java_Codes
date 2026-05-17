import java.util.Scanner;
class faboio {
    public static void main(String[] args) {
       try (Scanner Sc=new Scanner (System.in)) {

        System.out.println("Enter the number of terms: ");
        int n = Sc.nextInt();

        int firstterm = 0, secondterm = 1;

        System.out.println("Fibonacci series up to " +n+ " terms:");
        
        for (int i=1; i<=n; i++) {
            System.out.println(firstterm + ",");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;

        }

       }
    }
}