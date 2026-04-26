package generics.pro7;

public class StringRepository implements Repository<String> {
    String data;
    @Override
    public void save(String item) {
        data = item;
    }

    @Override
    public String get() {
        return data;
    }
}
