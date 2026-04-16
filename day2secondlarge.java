public class day2secondlarge {
    public static void main(String[] args) {
        int a=12, b=98, c=24;
        if ((a<b&&a>c)||(a>b&&a<c))
        System.out.println("A is second largest");
        else if ((b<a&&b>c)||(b>a&&b<c))
        System.out.println("B is second largest");
        else 
        System.out.println("C is second largest");
    }
}