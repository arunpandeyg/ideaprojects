package Dsa;

import java.util.Stack;

public class LinkedListPalindrome {
    static class Node{
        int data;
        Node next;
        Node(int tmp){data = tmp;}
    }
    static boolean ispalindrome(Node head){
        Node tmpNode = head;
        Stack<Integer> stack = new Stack<>();
        while (tmpNode != null){
            stack.push(tmpNode.data);
            tmpNode = tmpNode.next;
        }
        while (head != null){
            if (head.data != stack.pop()){
                return Boolean.FALSE;
            }
            head = head.next;
        }
        return Boolean.TRUE;
    }

    public static void main(String[] args) { //10 20 15 20 10 is palindrome
        Node n1 = new Node(14);
        Node n2 = new Node(28);
        Node n3 = new Node(28);
        Node n4 = new Node(50);
        Node n5 = new Node(15);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        boolean result = ispalindrome(n1);
        System.out.println("is it palindrome: " + result);
    }
}
