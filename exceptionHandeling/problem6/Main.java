package exceptionHandeling.problem6;

class Main {
    static void validateAge(int age){
        if(age < 18){
            throw new IllegalArgumentException();
        }else{
            System.out.println("Access is Granted");
        }
    }

    public static void main(String args[]){
        int age  = 17;
        validateAge(age);
    }
}
