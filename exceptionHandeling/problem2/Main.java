package exceptionHandeling.problem2;

class Main {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int b = 0;
        try{
        System.out.println( arr[9] );
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handles Array Exception");
        }

        try {
        System.out.println( arr[2] / 0);
        }catch (ArithmeticException e){
            System.out.println("Handled Arithmetic Exception");
        }finally{
            System.out.println("Program continues");
        }
    }
}
