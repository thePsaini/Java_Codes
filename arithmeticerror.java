public class arithmeticerror {
    public static void main(String[] args) {
        int a = 10;
         int b = 0;
        try {
             int result = a/b;
        }
             catch (ArithmeticException e)
        {
        System.out.println("invalid input");
         //System.out.println("end of program");
    }
    finally {
        System.out.println("please enter the valid number ");
    }
}}
// this code is for smooth run without actually solving the equation
// we can use it in notify the person that he is doing some mistake 