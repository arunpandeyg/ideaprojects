package Dsa;
//least recently used cache, LRU eviction policy,




import java.util.HashMap;
import java.util.Map;

class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public  Node(int k, int v){
        this.key = k; this.val = v;
    }
}
public class LRUCache {

Node head;
Node tail;

Map<Integer, Node> cacheMap;
int capacity;

public LRUCache(int c){
    this.capacity = c;
    head = new Node(-1, -1);
    tail = new Node(-1, -1);
    head.next = tail;
    tail.prev = head;
    cacheMap = new HashMap<>();
}
public  int get(int key){
    if (!cacheMap.containsKey(key)) return -1;
    moveToFront(cacheMap.get(key), true);
    return  cacheMap.get(key).val;
}

private void moveToFront(Node node, boolean isExistingNode){

    if (isExistingNode){
        Node prev = node.prev;
        node.next.prev = prev;
        prev.next = node.next;
    }
    node.next = head.next;
    head.next.prev = node;
    node.prev = head;
    head.next = node;
}
public void put(int key, int value){
    if (cacheMap.containsKey(key)){
        cacheMap.get(key).val = value;
        moveToFront(cacheMap.get(key), true);
    }
    else {
        if (cacheMap.size() == capacity){
            evictKey(tail.prev);
        }
        Node node = new Node(key, value);
        cacheMap.put(key,node);
        moveToFront(node, false);
    }
}
private void evictKey(Node node){
    Node prev = node.prev;
    node.next.prev = prev;
    prev.next = node.next;
    cacheMap.remove(node.key);
}
    public static void main(String[] args) {
    LRUCache cache = new LRUCache(2);
    cache.put(1,1);
    cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
