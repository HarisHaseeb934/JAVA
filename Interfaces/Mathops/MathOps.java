package Interfaces.Mathops;

interface MathOps {
    static int square(int x){
        return (x * x);
    }
    static int half(int x){
        return x/2;
    }
    static int add(int x, int y){
        return x + y;
    }
    static double divide(int x, int y){
        return (double) x / y;
    }
}
