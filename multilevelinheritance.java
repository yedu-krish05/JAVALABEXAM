class person{
    String name;
    int age;
    void displayname(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class employee extends person{
    int empid;
    void displayempid(){
        System.out.println("Employee ID: " + empid);
    }
}
class manager extends employee{
    int managerid;
    void displaymanagerid(){
        System.out.println("Manager ID: " + managerid);
    }
}
public class multilevelinheritance{
    public static void main(String args[]){
        manager m = new manager();
        m.name = "John Doe";
        m.age = 35;
        m.empid = 12345;
        m.managerid = 67890;
        
        m.displayname();
        m.displayempid();
        m.displaymanagerid();
    }
}