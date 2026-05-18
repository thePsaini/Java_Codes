import java.util.Scanner;
public class calculator2 {
   public static void main(String[] args) {
     try (Scanner sc  = new Scanner(System.in)) {
       
      
        System.out.print("enter num");
         int num= sc.nextInt();
         System.out.print("enter num2");
           int num2= sc.nextInt();
           System.out.println("addition: " + (num+num2));
           System.out.println("sub: " + (num-num2));
           System.out.println("multiply: " + (num*num2));
           System.out.println("modulus: " + (num%num2));


        
   } 
}
}