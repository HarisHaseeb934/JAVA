package Basics;

class Multiplicationtable {
    static void table(int a){
        for (int i = 1; i <= 10; i++){
            System.out.println(a + " X " + i + " = " + (a*i));
        }
    }

    public static void main(String[] args) {
        table(10);
    }
}
