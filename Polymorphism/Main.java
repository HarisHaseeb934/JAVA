package Polymorphism;

class Main {
    public static void main(String[] args) {
        // Vehicle Class
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start();

        // Shape CLass

//        Circle circle = new Circle(10);
//        circle.area();
//
//        Rectangle rectangle = new Rectangle(10,10);
//        rectangle.area();
//
//        Triangle triangle = new Triangle(10,10);
//        triangle.area();
//
//        Shape triangle2 = new Triangle(10,10);
//        triangle2.area();

        // MathOps Class
        MathOps math = new MathOps();
        math.add(10,10);
        math.add(10.1,10.2);
        math.add(1,2,3);
    }
}
