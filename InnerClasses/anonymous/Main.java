package InnerClasses.anonymous;

public class Main {
    public static void main(String args[]){
//        Greeting greet = new Greeting(){
//            public void sayHello(){
//                System.out.println("Hy Hello");
//            }
//        };
//        greet.sayHello();


        Animal animal = new Animal(){
            void sound(){
                System.out.println("Woooooooooooooof");
            }
        };
        animal.sound();
    }
}
