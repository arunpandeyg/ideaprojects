package challenge;

import java.util.ArrayList;

public class Challenge1 { //single sout
    public static void main(String[] args) {
        System.out.println("""
                Hi
                Hello
                By""");
    }
}


class Challenge1A{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi");
        al.add("Hello");
        al.add("Bye");
        for (String str : al){
            //System.out.print(str +",  ");
            //System.out.println();
            System.out.println(str);
        }
    }

}
