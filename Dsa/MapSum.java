package Dsa;
//map sum pairs, tries data structure.


import java.util.HashMap;
import java.util.Map;

public class MapSum {
    static class TrieNode{
        TrieNode[] next;
        int count;
        TrieNode(){this.next = new TrieNode[26];
        this.count = 0;
        }

    }
    TrieNode root;
    Map<String, Integer> map;

    public MapSum(){
        this.root = new TrieNode();
        this.map = new HashMap<>();
    }

    public void insert(String key, int val){
        int prev = 0;
        if (this.map.containsKey(key)) prev = this.map.get(key);
        this.map.put(key, val);
        TrieNode t = this.root;
        for (int i = 0; i < key.length(); i++){
            int index = key.charAt(i) - 'a';
            if (t.next[index] == null) t.next[index] = new TrieNode();
            t = t.next[index];
            t.count += val - prev;
        }
    }
    public int sum(String prefix){
        TrieNode t = this.root;
        for (int i = 0; i < prefix.length(); i++){
            int index = prefix.charAt(i) - 'a';
            if (t.next[index] == null) return 0;
            t = t.next[index];
        }
        return t.count;
    }

    public static void main(String[] args) {
        MapSum ms = new MapSum();
        ms.insert("apple", 3);
        System.out.println(ms.sum("ap"));
        ms.insert("app", 2);
        System.out.println(ms.sum("ap"));
    }

}
