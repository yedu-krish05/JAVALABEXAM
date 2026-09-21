class animal{
    void animaltype(){
        System.out.println("pets");

    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class heirarchicalinheritance{
    public static void main(String args[]){
        cat c = new cat();
        c.animaltype();
        dog d = new dog();
        d.animaltype();
        d.bark();
        c.meow();
    }
}