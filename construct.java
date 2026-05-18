class A{
    String a;
    int b;

    // A(){
    // a ="name";
    // b = 20;
    // }

    void display(){
        
        System.out.println("name : " +a);
        System.out.println("age : " +b);
    }
}

public class construct{
    public static void main(String[] args) {
        A a1 = new A();

        a1.display();
        
    }
}