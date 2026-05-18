import java . util. Scanner;
public class sum_single_array {
    public static void main(String[] args) {
        
    
Scanner sc=new Scanner(System.in);

System.out.println("enter number of elements");
int a=sc.nextInt();
int sum=0;
int arr[]=new int[a];
System.err.println("enter "+ a + " elements");
for(int i=0;i<a;i++){

    arr[i]=sc.nextInt();
    sum+=arr[i];
}
System.out.println(sum);
}}