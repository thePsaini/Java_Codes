import java.util.Scanner;
public class singlearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int m = sc.nextInt();

        int arr[] = new int[m];
        for (int i=0; i<m; i++) {
                System.out.print("arr[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
        
        System.out.println("These elements are: ");
        for (int i=0; i<m; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
