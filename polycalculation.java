class polycalculation{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
     void sum(double a, double b){
        System.out.println(a+b);
        
}
void  sum (int a, double b) {
    System.out.println(a+b);
}
public static void main(String[] args) {
    polycalculation obj = new polycalculation();
    obj.sum(10,20);
    obj.sum(10,20,30);
    obj.sum(12.89,15.88);
    obj.sum(3,8.9);
}
    
}