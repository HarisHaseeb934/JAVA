package Encapsulation;

class Rectangle {
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void displayArea(){
        System.out.println("Area = " + (length * width));
    }
}
