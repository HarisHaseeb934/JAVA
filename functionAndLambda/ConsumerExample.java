package functionAndLambda;
import java.util.function.Consumer;

public class ConsumerExample {
    static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("My name is Haris");
    }
}
