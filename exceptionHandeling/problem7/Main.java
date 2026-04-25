package exceptionHandeling.problem7;

class Main {
    static void process(int age) throws IllegalArgumentException{
        throw new IllegalArgumentException();
    }

    public static void main(String args[]){
        int age = 17;
        process(age);
    }
}
