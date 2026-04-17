package Encapsulation;

class Circle {
        double radius;
        final double PI = 3.14;

        Circle(double radius){
            this.radius = radius;
        }

        double calculateArea(){
            return PI * (radius * radius);
        }
        double calculateCircumference(){
            return 2 * PI * radius;
        }
}
