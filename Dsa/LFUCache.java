package Dsa;
//LFu cache

import java.util.HashMap;
import java.util.LinkedHashSet;

public class LFUCache {
    HashMap<Integer, Integer> cache = new HashMap<>();
    HashMap<Integer, Integer> keyCounts = new HashMap<>();
    HashMap<Integer, LinkedHashSet<Integer>> freqMap = new HashMap<>();
    int capacity;
    int min = -1;
    public LFUCache(int capacity){
       this.capacity = capacity;
       freqMap.put(1, new LinkedHashSet<>());
    }
    public  int get(int key){
        if (cache.containsKey(key) == false) return -1;
        int count = keyCounts.get(key);
        keyCounts.put(key, count + 1);
        freqMap.get(count).remove(key);
        if (count == min && freqMap.get(count).size() == 0) min++;
        if (freqMap.containsKey(count + 1) == false) freqMap.put(count + 1, new LinkedHashSet<>());
        freqMap.get(count + 1).add(key);
        return cache.get(key);
    }
    public  void put(int key, int value){
        if (capacity <= 0) return;
        if (cache.containsKey(key)){
            cache.put(key, value);
            get(key);
            return;
        }
        if (cache.size() >= capacity){
            int evict = freqMap.get(min).iterator().next();
            freqMap.get(min).remove(evict);
            cache.remove(evict);
            keyCounts.remove(evict);
        }
        cache.put(key, value);
        keyCounts.put(key, 1);
        min = 1;
        freqMap.get(1).add(key);
    }

    public static void main(String[] args) {
        LFUCache lfu = new LFUCache(2);
        lfu.put(1,1);
        lfu.put(2,2);
        System.out.println(lfu.get(1));
        lfu.put(3,3);
        System.out.println(lfu.get(2));
        System.out.println(lfu.get(3));
        lfu.put(4,4);
        System.out.println(lfu.get(1));
        System.out.println(lfu.get(3));
        System.out.println(lfu.get(4));

    }
}
