package journey;
import java.util.Scanner;

abstract class Transport {
    final void showRules(){
        System.out.println("1 : Stand clear of doorways to allow for smooth entry/exit and prevent delays.");
        System.out.println("2 : Don't take up multiple seats with bags or by reclining.");
        System.out.println("3 : Talk quietly and avoid loud phone calls or conversations.");
    }
    abstract int calculateFare();
}

class Bus extends Transport{
    String busName;
    double distance;
    final double farePerKm = 50;
    int calculateFare(){
        return (int) (distance * farePerKm);
    }
}


class Train extends Transport{
    String trainName;
    double distance;
    final double farePerKm = 30.7;
    int calculateFare(){
        return (int) (distance * farePerKm);
    }
}


public class Main{
    public static void main(String args []){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Transport (Bus or Train) : ");
        String transport = sc.nextLine();


        if(transport.equalsIgnoreCase("bus")){
            Bus bus = new Bus();
            System.out.print("Enter Bus Name = ");
            bus.busName = sc.nextLine();
            System.out.print("Enter Your Distance in KM = ");
            bus.distance = sc.nextDouble();
            System.out.println("Total fare = " + bus.calculateFare());
        }else{
            Train tr = new Train();
            System.out.print("Enter Train Name = ");
            tr.trainName = sc.nextLine();
            System.out.print("Enter Your Distance in KM = ");
            tr.distance = sc.nextDouble();
            System.out.println("Total fare = " + tr.calculateFare());
        }

    }
}