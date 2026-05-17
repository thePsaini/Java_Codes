class vehicle {
    void run() {
      System.out.println("Vehicle can run");
    }
}
class car extends vehicle {
    void fuel() {
        System.out.println("Car uses fuel");
    }
}
class electriccar extends car {
    void battery() {
        System.out.println("Electric car uses battery");
    }
}
public class oops {
    public static void main(String[] args) {
        electriccar e = new electriccar();
        e.fuel();
        e.run();
        e.battery();
    }
}
