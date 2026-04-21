package Static;

class FinalObject {
    String name;
    private FinalObject(){}
    static final FinalObject a = new FinalObject();
    static FinalObject getinstance(){
        return a;
    }
}
