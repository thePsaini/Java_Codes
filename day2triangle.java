public class day2triangle {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        if ((a+b>c)&&(b+c>a)&&(a+c>b))
        System.out.println("Valid Triangle");
        else 
        System.out.println("Not Valid Triangle");
    }
}
