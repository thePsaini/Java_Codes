abstract class car {
     public abstract void start();
     abstract void stop();
     public void  start1() {
        System.out.println("car started");
     }
     
     void stop1() {
        System.out.println("car stopped");
     }}
     class bike extends car {
        public void start() {
            System.out.println("bike starts");
        }

        void stop() {
            System.out.println("bike stopped");
     }
     }
     class bus extends car {
        @Override
       public  void start() {
            System.out.println("bus starts");
        }
        @Override
        void stop() {
            
            System.out.println("bus stops");
        }
     }
     public class abstration {
        public static void main(String[] args) {
            car v1 = new bike();
            v1.start();
            v1.stop();
            car v2 = new bus();
            v2.start();
            v2.stop();

        }
     }
