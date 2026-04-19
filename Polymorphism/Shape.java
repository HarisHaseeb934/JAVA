package Polymorphism;

class Shape {
    double length;
    double width;
    double radius;
    double base;

    void area(){
        System.out.println("Define Shape");
    }
}
class Circle extends Shape{
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("Area of a Circle is = " + 3.14 * (radius * radius));
    }
}
class Rectangle extends Shape{
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void area(){
        System.out.println("Area of a Rectangle = " + length * width);
    }
}
class Triangle extends Shape{
    Triangle(double base, double length){
        this.base = base;
        this.length = length;
    }
    void area(){
        System.out.println("Area of Triangle = " + (length * base) / 2);
    }
}
