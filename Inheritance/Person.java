package Inheritance;

class Person {
    String name;
    Person(String name){
        this.name = name;
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
}
