public class day4b {
    public static void main(String[] args) {
        int n=2;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (i>=j) {
                    System.out.print(n+ " ");
                n=n+2;
                }
                
            }
            System.out.println();
        }
    }
}