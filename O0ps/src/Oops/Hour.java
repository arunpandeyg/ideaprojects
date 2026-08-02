package Oops;


class Hour{            //constructor practice
    int minute,  second;

     Hour(int minute, int second) {
        this.minute = minute;
        this.second = second;
        System.out.println("Hour " +minute);
        System.out.println("Hour " +second);
    }
}
class Hour1 extends Hour{
    public static void main(String[] args) {
        Hour1 hour1 = new Hour1(3,6);

        System.out.println("minute main seconds: "  );
        Hour hour = new Hour(5,6);

    }
     Hour1(int minute, int second) {

        super(minute, second);
        System.out.println("Hour1 " +minute);

        System.out.println("Hour1 " +second);
    }
}
class HourA{
    int x;
    int y;
    HourA(int hour, int minute){      //default constructor
        x = hour;
        y = minute;

    }
    void hour(){       //default method
        System.out.println("Mourning hours and minute: " +x +" : " +y);
    }
    HourA(HourA ref){           //copy constructor
        x = ref.x;
        y = ref.y;
        System.out.println("Copy of Morning hour and minute:" +x+ " : " +y);

    }
}
class HourA1{
    public static void main(String[] args) {

        HourA ha = new HourA(5,30);
        HourA ha2 = new HourA(ha);
        System.out.println("Main" );
        HourA1 ha1 = new HourA1();
        ha.hour();
        ha1.Hour(6, 20);
    }
    void Hour(int hour, int minute){      //parameterized method

        System.out.println("Evening hour: " +hour+ " : " +minute);


    }
}
 class Hour2{          // method calling differently
    public static void Run(int n){
        System.out.println("Run Method: "+n);
        Run();
    }

     public static void main(String[] args) {
         System.out.println("Main: Hello :");
         Run(5);
     }
     public static void Run(){
         System.out.println("Jai Shri Ram ");
         Eat();
     }
     public static void Eat(){
         System.out.println("Apple is very Testy");
     }


}


