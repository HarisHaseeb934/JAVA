package Enum;

import Enum.p5.ReportType;

class Main {
    public static void main(String args[]){

//        for(Day day : Day.values()){
//            if(day == Day.SATURDAY || day == Day.SUNDAY){
//                System.out.println(day + " : Weekend");
//            }else{
//                System.out.println(day + " : Week day");
//            }
//        }


//        for(TrafficLight light : TrafficLight.values()){
//            switch(light){
//                case RED:
//                    System.out.println("Stop");
//                    break;
//                case YELLOW:
//                    System.out.println("Ready");
//                    break;
//                case GREEN:
//                    System.out.println("Go");
//                    break;
//            }
//        }


//        CoffeeSize cs = CoffeeSize.SMALL;
//        cs.getPrice();
//        cs.thank();


        for(ReportType rt : ReportType.values()){
            rt.print();
        }
    }
}
