package groceary;
import java.util.LinkedList;
public class LL {
    public static void main(String[] args) {
        LinkedList<java.io.Serializable> ll = new LinkedList<>();
        ll.addFirst(100);
        ll.add(1,"Apple");
        ll.add(2,3.22);
        ll.addLast(600);

        System.out.println( "Linked List:" +ll);

        System.out.println(ll.size());

    }


}
