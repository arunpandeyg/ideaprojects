package leetCode;
//find out anagrams, anagrams is a word formed from the same word.


import java.util.*;

public class Anagrams6 {

    public List<List<String>> groupAnagrams(String[] inputArr){
        Map<String, List<String>> groupAnagrams = new HashMap<>();
        for (String str : inputArr){
            char[] charArr = str.toCharArray();                       //read one by one
            Arrays.sort(charArr);                                     // and sort
            String sortedStr = String.valueOf(charArr);               //reconstruct the string
            if (!groupAnagrams.containsKey(sortedStr)){               //if key exists in the array
                groupAnagrams.put(sortedStr, new ArrayList<>());      // add the empty array list
            }
            groupAnagrams.get(sortedStr).add(str);                    // group anagram words
        }
        return new ArrayList<>(groupAnagrams.values());
    }
    public static void main(String[] args) {
        Anagrams6 ga = new Anagrams6();
        String[] inputArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(ga.groupAnagrams(inputArr));
    }
}
