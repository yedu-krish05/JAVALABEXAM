class person{
    int age;
    String name;
     person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
class students extends person{
    int rollno;
    int marks;
    students(int age, String name, int rollno, int marks){
        super(age, name);
        this.rollno = rollno;
        this.marks = marks;
        
    }
    void display(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll No: " + rollno);
            System.out.println("Marks: " + marks);
        }
}
public class constructorinheritance{
    public static void main(String args[]){
        students s = new students(20, "John Doe", 101, 85);
        s.display();
        
    }
}