package InnerClasses.staticinner;

class Car {
    static String company;
    String carName;
    Car(String compName, String name){
        company = compName;
        carName = name;
    }
    static class Engine{
        void show(){
            System.out.println("Company Name is " + company);
//            System.out.println("Car Name is " + carName);
        }
    }

}
