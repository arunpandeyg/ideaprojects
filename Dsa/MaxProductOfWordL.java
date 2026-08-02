package Dsa;
//maximum product of word lengths


public class MaxProductOfWordL {
    public int maxProduct(String[] words){
        if (words == null || words.length == 0) return 0;
        int len = words.length;
        int[] wordBitValue = new int[words.length];
        for (int i = 0; i < len; i++){
            for (int j = 0; j < words[i].length(); j++){
                wordBitValue[i] |= 1 << (words[i].charAt(j) - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < len; i++){
            for (int j = i + 1; j < len; j++){
                if ((wordBitValue[i] & wordBitValue[j]) == 0){
                    int product = words[i].length() * words[j].length();
                    if (product > maxProduct)  maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
         MaxProductOfWordL maxProd = new MaxProductOfWordL();
         System.out.println(maxProd.maxProduct(new String[] {"abcm", "baz", "foo", "bar", "xtfn", "abcdef"}));
         System.out.println(maxProd.maxProduct(new String[] {"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
         System.out.println(maxProd.maxProduct(new String[] {"abd", "aa", "aaa", "aaaa"}));

    }
}
