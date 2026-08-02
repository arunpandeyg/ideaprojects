package challenge;


import java.util.ArrayList;

public class Challenge9 {  //continue
   static void findMultiples(int n){
       for (int i = 1; i < n; i++){
           if (i%3 == 0 || i % 5 == 0 ){
               if (i % 3 == 0 && i % 5 == 0){
                   continue;
               }
               System.out.println(i);
           }
       }
   }

    public static void main(String[] args) {
      findMultiples(50);
    }
}
class A{
    public static void main(String[] args) {
        for (int i = 0; i<=50; i++){
            if (i%3==0&&i%5==0){
                continue;
            }
            else if (i%3==0){
                System.out.println(i);
            }
            else if (i%5==0){
                System.out.println(i);
            }
            else {}
        }
    }
}
class B{
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
            if(i%3==0|| i%5==0){
                if (i%3==i%5)
                    continue;
                System.out.println(i);
            }
        }
    }
}
class C{
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
            if(i%3==0|| i%5==0){
                if (i%(3*5)==0)
                    continue;
                System.out.println(i);
            }
        }
    }
}
class D{
    static ArrayList<Integer> al = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i<= 50; i++){
            if (i%3==0 && i%5==0){
                continue;
            }
            else if (i/3>0 && i%3==0 || i/5>0 && i%5==0){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}


