package Interfaces.Conflict;

class Test extends ParentTest implements A,B{
    public void show(){
        A.super.show();
        B.super.show();
    }
}
