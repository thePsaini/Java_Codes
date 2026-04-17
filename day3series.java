public class day3series {
    public static void main(String[] args) {
        int n=15;
        int a=0;
        int b=0;
         int total=0;
        for (int i=0; i<=n; i++) {
            if (i%2==0) {
                a=a-i;
            }
            else {
                b=b+i;
            }
            total = a+b;


        }
        System.out.println(total);
    }
}