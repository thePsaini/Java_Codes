import java.util.Scanner;
class natusumio {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
            System.out.println("Enter the number");
            int n = Sc.nextInt();
            int  sum = 0;
            for (int i = 1; i <=n; i++) {
                sum += i;
            }
            System.out.println("sum = " +sum);
        }
}
