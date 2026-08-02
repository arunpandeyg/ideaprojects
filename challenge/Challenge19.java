package challenge;

//instance method

public class Challenge19 {
    static Challenge19 c = null;
    static {
        c = new Challenge19();
        c.fun();
    }
    void fun(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        c.fun();
    }
}
