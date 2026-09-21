interface printable{
    void print();
}
interface scannable{
    void scan();
}
 class multifunctional implements printable, scannable{
     public void print(){
        System.out.println("Printing document");
    }
    public void scan(){
        System.out.println("Scanning document");
    }
}
public class interfaceinheritance{
    public static void main(String args[]){
        multifunctional mf = new multifunctional();
        mf.print();
        mf.scan();
    }
}