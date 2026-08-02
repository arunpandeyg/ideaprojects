package Oops;


public class Cons {    //constructor
    int a;
    String name;
    Cons(){   // for default constructor comment this constructor
        a = 0; name = null;
    }
    void Show(){
        System.out.println(a+ " " +name);
    }

}
class Cons1{
    public static void main(String[] args) {
        Cons c = new Cons();
        c.Show();
        System.out.println("hello ");
    }
}
class Cons2{     //default constructor
    int a; String b; boolean c;
    Cons2(){   // comment this constructor to know default constructor
        a= 100; b = "Raj"; c = true;
    }
    void Disp(){
        System.out.println(a+ " " +b+ " " +c);
    }
}
class B{
    public static void main(String[] args) {
        Cons2 c = new Cons2();
        c.Disp();
    }
}



