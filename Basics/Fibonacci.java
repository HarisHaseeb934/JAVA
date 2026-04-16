package Basics;

public class Fibonacci {
    static void fabi(int num){
        int a = 0;
        int b = 1;

        for(int i = 1; i <= num; i++){
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        int num = 6;
        fabi(num);
    }
}
