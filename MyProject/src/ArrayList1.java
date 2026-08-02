import java.util.ArrayList;
import java.util.Collections;
import java.lang.Integer;

class ArrayLists {

      public static void main(String [] arg) {
          int Integer = 0;
          ArrayList<Integer> list = new ArrayList<>(Integer);

          //add elements
          list.add(0);
          list.add(2);
          list.add(3);
          System.out.println(list);

          //get elements
            Integer element = list.get(0);
          System.out.println(element +" ");

          //add elements in between
          list.add(1, 1);
          System.out.println(list +" ");

          //set elements
          list.set(0, 5);
          System.out.println(list);

          //delete elements
          list.remove(3);
          System.out.println(list);

          //size
          int size = list.size();
          System.out.println(size);

          //loops
          for (Integer integer : list) {
              System.out.print(integer +" ");
          }
          System.out.println();

          //sorting
          Collections.sort(list);
          System.out.println(list +" ");

          // search


      }
  }
  public class ArrayList1{
      public static void main(String[] args) {
          ArrayList<String> al = new ArrayList<>();
          al.add("x");
          al.add("y");
          al.add("z");
          al.add("t");
          al.add("u");
          ArrayList<String> al2 = new ArrayList<>(al);
          System.out.println(al2 +"\n");
          al2.removeAll(al);
          System.out.println("After removed: " +al2);


      }
  }
