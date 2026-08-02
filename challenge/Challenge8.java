package challenge;

public class Challenge8 {
    void access(){
        System.out.println("I am controlling both static and none static");
    }
    {
        access1();
        this.access2();
    }

    public static void main(String[] args) {
        Challenge8 ch = new Challenge8();
        ch.access();

    }
    static void access1(){
        System.out.println("I am from Static access");
    }
    void access2(){
        System.out.println("I am from non static access");
    }

}
