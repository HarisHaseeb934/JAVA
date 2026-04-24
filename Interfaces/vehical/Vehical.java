package Interfaces.vehical;

interface Vehical {
    int tyre = 4;
    int seats = 5;
    void start();
    default void fuelType(){
        System.out.println("Petrol");
    }
}
