package Basics;

class SwapNums {
    static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a + " b : " + b);
    }
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        swap(5 ,3);
    }
}
