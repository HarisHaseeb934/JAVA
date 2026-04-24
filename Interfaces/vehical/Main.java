package Interfaces.vehical;

class Main {
    public static void main(String args[]){
        ElectricCar car = new ElectricCar("City", "Honda");
        car.start();
        car.fuelType();
    }
}
