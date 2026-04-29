package functionAndLambda;

@FunctionalInterface
interface Calculator{
    double calculate(int a , int b);
}
public class Pro1 {
    static void main(String[] args) {
        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator multi = (x, y) -> x * y;
        Calculator divide = (x, y) -> x / y;

        System.out.println("Add : " + add.calculate(10,20));
        System.out.println("Sub : " + sub.calculate(10,20));
        System.out.println("Multi : " + multi.calculate(10,20));
        System.out.println("Divide : " + divide.calculate(30,20));

    }
}
