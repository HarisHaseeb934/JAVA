package Interfaces.appliance;

class Main {
    public static void main(String args[]){
        Fan fan = new Fan(3,4.5);
        fan.turnOn();
        fan.turnOff();
    }
}
