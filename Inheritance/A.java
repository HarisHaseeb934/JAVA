package Inheritance;

class A {
    A(){
        System.out.println("A Default Constructor");
    }
    A(int x){
        System.out.println("Parameterized Constructor " + x);
    }
}
class B extends A{
    B(){
        super();
        System.out.println("B Default Constructor");
    }
    B(int x){
        super(x);
        System.out.println("B Parameterized Constructor" + x);
    }
}