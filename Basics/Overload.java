package Basics;

class Overload {
    static final float PI = 3.14f;
    static void area(float diameter){
        System.out.println("Circle Area = " + PI * (diameter * diameter));
    }
    static void area(float width, float length){
        System.out.println("Rectangle Area = " + (width * length));
    }
    static void area(float base, double height){
        System.out.println("Triangle Area = " + (base * height) / 2);
    }

    public static void main(String[] args) {
        area(5.16f);
        area(10.1f,6.12f);
        area(13.2f,6.52);
    }
}
