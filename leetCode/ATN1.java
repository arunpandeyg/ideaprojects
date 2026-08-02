package leetCode;

public class ATN1 {
    static class node {
        int val;
        node next;
        public node(int val){
            this.val = val;
        }
    }
    //function to print linked list
    void printList(node head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    node head1, head2, result;
    int carry;
    //A utility function to push a value to linked list
    void push(int val, int list){
        node newNode = new node(val);
        if (list ==1){
            newNode.next = head1;
            head1 = newNode;
        }
        else if (list == 2){
            newNode.next = head2;
            head2 = newNode;
        }
        else {
            newNode.next = result;
            result = newNode;
        }
    }
    //add two linked lists of same size represented by head1 and head2 and returns head of the resultant
    // linked list. carry is propagated while returning from the recursion
    void addSameSize(node n, node m){
        //since the function assumes linked lists are of same size check any of the two head pointers'
        if (n == null)
            return;
        //recursively add remaining nods and get the carry
        addSameSize(n.next, m.next);
        //add digits of current nodes and propagate carry
        int sum = n.val + m.val + carry;
                carry = sum / 10;
                sum = sum % 10;
                //push this to result list
        push(sum, 3);
    }
    node curr;
    //this function is called after the smaller list is added to the bigger list's sublist of same size.
    // once the right sublist is added the carry must be added to the left side of larger list to get the
    // final result.
    void propagateCarry(node head1){
        //if difference number of nodes are not traversed. add carry
        if (head1 != curr){
            propagateCarry(head1.next);
            int sum = carry + head1.val;
            carry = sum / 10;
            sum %= 10;
            //add this node to the front of the result
            push(sum, 3);
        }
    }
    int getSize(node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    //the main function that added two linked lists represented by head1 and head2. the sum of
    // two lists is stored in a list referred by result.
    void addLists(){
        //first list is empty
        if (head1 == null){
            result = head2;
            return;
        }
        //second list is empty
        if (head2 == null){
            result = head1;
            return;
        }
        int size1 = getSize(head1);
        int size2 = getSize(head2);
        //add same size lists
        if (size1 == size2){
            addSameSize(head1, head2);
        }
        else {
            //first list should always be larger than second list if not swap pointers
            if (size1 < size2){
                node temp = head1;
                head1 = head2;
                head2 = temp;
            }
            int diff = Math.abs(size1 - size2);
            //move diff number of nodes in first list
            node temp = head1;
            while (diff-- >= 0){
                curr = temp;
                temp = temp.next;
            }
            //get addition of same size lists
            addSameSize(curr, head2);
            //get addition of remaining first list and carry
            propagateCarry(head1);
        }
        //if some carry is still there add a new node to the front of the result list. e.g. 999 and 87
        if (carry > 0){
            push(carry, 3);
        }
    }
    //driver program to test above function
    public static void main(String[] args) {
        ATN1 list = new ATN1();
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        int []arr1 = {7,5,9};
        int[]arr2 = {7,0,5};
        //create first list as 9->9->9
        for (int i = arr1.length - 1; i >= 0;--i )
            list.push(arr1[i],1);
        //create second list as 1->8
        for (int i = arr2.length - 1; i >= 0; --i)
            list.push(arr2[i], 2);
        list.addLists();
        list.printList(list.result);
    }
}
