package generics.pro7;

public interface Repository <T>{
    void save(T item);
    T get();
}
