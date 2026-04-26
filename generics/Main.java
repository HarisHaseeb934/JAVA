package generics;

public class Main {
    public static void main(String[] args) {

        // Problem 1
        Pro1<Integer> box = new Pro1<>();
        box.setValue(10);
        System.out.println(box.getValue());

        Pro1<String> box1 = new Pro1<>();
        box1.setValue("Haris");
        System.out.println(box1.getValue());

        Pro1<Double> box2 = new Pro1<>();
        box2.setValue(10.1);
        System.out.println(box2.getValue());

        // Problem 5
        Pro5<Integer> calculate = new Pro5<>();
        System.out.println(calculate.add(10,15));
        System.out.println(calculate.sub(20,25));
        System.out.println(calculate.multi(20,20));

    }
}
