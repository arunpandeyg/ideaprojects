package Oops;




public class Calculation {
    int a;
    int b;

    //method without parameters, method may not return any value print direct using println
    /* void sum(){
        System.out.println(a+b);
    }
    void sum(int x, int y){
                a = x;
                b = y;
        System.out.println(a+b);
    }*/
    int sum() {
        return (a + b);
    }


    public static void main(String[] args) {
        Calculation cal = new Calculation();
        /*cal.a = 100;
        cal.b = 200;
        cal.sum();
        cal.sum(100, 200);

    }*/
        cal.a = 100;  //method return some value
        cal.b = 200;
        int r = cal.sum();
        System.out.println(r);


    }
}
