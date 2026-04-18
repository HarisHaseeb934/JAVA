package Abstraction;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        System.out.println("Circle Area = " + (3.14 * (radius * radius)));
    }
    void perimeter(){
        System.out.println("Circle Perimeter = " + (2 * 3.14 * radius));
    }
}
class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    void area(){
        System.out.println("Rectangle Area = " + (width * length));
    }
    void perimeter(){
        System.out.println("Rectangle Area = " + (2 * (width + length)));
    }
}
