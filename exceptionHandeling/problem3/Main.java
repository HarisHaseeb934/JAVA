package exceptionHandeling.problem3;

class Main {
static int divide( int a , int b){
    int result = 0;
    try{
        result =  (int)(a / b);
    }catch(ArithmeticException e){
        System.out.println("Handel");
    }
    return result;
}
    public static void main (String args[]){
    int arr[] = {15,20,35,40,555};
    int arr2[] = {1,2,3,0,5};
    for(int i = 0 ; i < arr.length; i++){
        System.out.println("Divide : " + divide(arr[i],arr2[i]));

    }
    }
}
