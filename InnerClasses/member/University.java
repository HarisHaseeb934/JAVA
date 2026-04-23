package InnerClasses.member;

class University {
    String name;
    class Department{
        String departName;
        Department(String uniName , String departName){
            name = uniName;
            this.departName = departName;
        }
        void showDetails(){
            System.out.println("University Name : " + name);
            System.out.println("Department Name : " + departName);
        }
    }
}
