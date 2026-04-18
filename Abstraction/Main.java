package Abstraction;

class Main {
    public static void main(String args[]){

//        Class Payment
//        CreditCard cc = new CreditCard();
//        cc.pay(1000);
//
//        PayPal pp = new PayPal();
//        pp.pay(20);
//        pp.receipt();

//        Class Shape
//        Circle circle = new Circle(10);
//        circle.area();
//        circle.perimeter();
//
//        Rectangle rect = new Rectangle(10,10);
//        rect.area();
//        rect.perimeter();

//        Class Question
//        Question q1 = new Mcq("My name is \n a) Haris \n b) Soban", "a");
//        System.out.println(q1.questionText);
//        System.out.println(q1.checkAnswer("b") ? "Correct" : "False");
//
//        Question q2 = new TrueFalse("My name is Soban", true);
//        System.out.println(q2.checkAnswer("true")? "Correct" : "False");

//        Class File Processor
//        FileProcessor text = new TextFileProcessor();
//        text.processFile();
//
//        System.out.println();
//
//        FileProcessor cvs = new TextFileProcessor();
//        cvs.processFile();

//        Class Appliance
        Fan fan = new Fan(2);
        fan.turnOn();
        fan.turnOff();

        System.out.println();

        WashingMachine wm = new WashingMachine("Dryer");
        wm.turnOn();
        wm.turnOff();

    }
}
