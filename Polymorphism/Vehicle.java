package Polymorphism;

class Vehicle {
    void start(){
        System.out.println("Vehicle Start");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car Start");
    }
}
