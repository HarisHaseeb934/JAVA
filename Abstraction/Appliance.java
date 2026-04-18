package Abstraction;

abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}
class Fan extends Appliance{
    double speed;
    Fan(double speed){
        this.speed = speed;
    }
    void turnOn(){
        System.out.println("Fan is turn on at speed = " + speed);
    }
    void turnOff(){
        System.out.println("Fan is turn off");
    }
}
class WashingMachine extends Appliance{
    String mode;
    WashingMachine(String mode){
        this.mode = mode;
    }
    void turnOn(){
        System.out.println("Washing Machine is turn on at mode = " + mode);
    }
    void turnOff(){
        System.out.println("Washing Machine is turn off");
    }
}
