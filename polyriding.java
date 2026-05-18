class transport{
    void move(){
        System.out.println("transport moves");

    }
    void fuel (){
        System.out.println("fuel is going to extinct so transport won't move");

    }
}
 class bus extends transport{
        void move(){
            System.out.println("bus moves on road");
            
        }
         void fuel (){
        System.out.println("fuel is going to extinct so bus also  won't move");

    }
    }
    class train extends transport{
        void move(){
            System.out.println("train moves on track");
            
        }
         void fuel (){
        System.out.println("fuel is going to extinct so train also  won't move");

    }
    }
    class aeroplane   extends transport{
        void move(){
            System.out.println("aeroplane fly in air");
            
        }
         void fuel (){
        System.out.println("aeroplane aldo won't fly");

    }
    }


public class polyriding {
    public static void main(String[] args) {
        transport t;
        t=new bus();
        t.move();
        t.fuel();
        System.out.println();

        t=new train();
        t.move();
        t.fuel();
        System.out.println();
        t=  new aeroplane();
        t.move();
        t.fuel();
        



    }

    
}