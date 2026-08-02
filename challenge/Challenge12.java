package challenge;

public class Challenge12 { //class parent
    Challenge12(){
        System.out.println("parent class");
    }

}
class Child extends Challenge12 {
    Child() {
        super();//by default
        System.out.println("Child class constructor");
    }

}

