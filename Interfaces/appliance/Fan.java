package Interfaces.appliance;

class Fan  implements Appliance{
    int wings;
    double speed;
    Fan(int wings, double speed){
        this.wings = wings;
        this.speed = speed;
    }
    public void turnOn(){
        System.out.println("this fan has " + wings + " and speed is " + speed );
        System.out.println("Fan is turn on");
    }
    public void turnOff(){
        System.out.println("Fan is turn off");
    }
}
