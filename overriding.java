class bank{
    void getinterest(){
        System.out.println("The interest rate is 0%");
    }
}
class sbi extends bank{
    void getinterest(){
        System.out.println("The interest rate of sbi is 5%");
    }
}
class hdfc extends bank{
    void getinterest(){
        System.out.println("The interest rate of hdfc is 6%");
    }
}
class icici extends bank{
    void getinterest(){
        System.out.println("The interest rate of icici is 7%");
    }
}
public class overriding{
    public static void main(String args[]){
        bank b = new bank();
        b.getinterest();
        sbi s = new sbi();
        s.getinterest();
        hdfc h = new hdfc();
        h.getinterest();
        icici i = new icici();
        i.getinterest();
    }
}