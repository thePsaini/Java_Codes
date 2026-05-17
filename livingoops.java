class livingbeing {
    void breath() {
        System.out.println("All living organism breath");
    }
}
class animal extends livingbeing {
    void eat() {
        System.out.println("All animal eat");
    }
}
class bird extends animal {
    void flying() {
        System.out.println("Birds can fly");
    }
}
class parrot extends bird {
    void speak() {
        System.out.println("Parrots can speak");
    }
}
public class livingoops {
    public static void main(String[] args) {
        parrot I = new parrot();
        I.breath();
        I.eat();
        I.flying();
        I.speak();
    }
}
