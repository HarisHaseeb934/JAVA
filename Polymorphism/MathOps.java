package Polymorphism;

class MathOps {
    void add(int a, int b){
        System.out.println(a + " " + b + " = " + (a + b));
    }
    void add(double a, double b){
        System.out.println(a + " " + b + " = " + (a + b));
    }
    void add(int a, int b, int c){
        System.out.println(a + " " + b + " " + c + " = " + (a + b + c));
    }
}
