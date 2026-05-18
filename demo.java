
interface I1 {
    void method1();
}

interface I2 {
    void method2();
}

interface I3 {
    void method3();
}

public class demo implements I1, I2, I3 {

    @Override
    public void method1() {
        System.out.println("Method 1 from I1 executed.");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from I2 executed.");
    }

    @Override
    public void method3() {
        System.out.println("Method 3 from I3 executed.");
    }

    public static void main(String[] args) {
        demo obj = new demo();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}