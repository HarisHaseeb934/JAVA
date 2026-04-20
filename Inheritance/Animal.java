package Inheritance;

class Animal {
    void eat(){
        System.out.println("Eats Dog Food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Woof Woof");
    }
}

