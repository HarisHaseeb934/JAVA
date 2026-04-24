package Interfaces.vehical;

class ElectricCar implements Vehical {
    String carName;
    String company;
    ElectricCar(String carName, String company){
        this.carName = carName;
        this.company = company;
    }
    public void start(){
        System.out.println(carName +" is starting");
    }
    public void fuelType(){
        System.out.println("This " + company + " car company made Electric fuel");
    };
}
