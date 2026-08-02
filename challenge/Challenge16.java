package challenge;

public class Challenge16 {    //super key word
    void  method1(){
        System.out.println("Parent class ");
    }
}
class Children extends Challenge16{
    void method1(){
        super.method1();
        System.out.println("Child class");
    }
}
class ChildrenMain{
    public static void main(String[] args) {
        Children ch = new Children();
        ch.method1();
    }
}
