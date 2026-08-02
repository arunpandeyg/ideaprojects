package challenge;

import java.util.concurrent.Callable;

public class Challenge6 {   //static bloc and none static or instance block.
    static {
        System.out.println("its static block");
    }
    {
        System.out.println("its instance block");
    }
    public static void main(String[] args) {
        Challenge6 ch = new Challenge6();
        Challenge6 ch1 = new Challenge6();
        Challenge6 ch2 = new Challenge6();

    }
}
