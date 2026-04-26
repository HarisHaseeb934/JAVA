package generics;

public class Pro5<T extends Number> {
    double add(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
    double sub(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }
    double multi(T a, T b){
        return a.doubleValue() * b.doubleValue();
    }
}
