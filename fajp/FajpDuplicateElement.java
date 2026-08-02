package fajp;

import java.util.HashSet;

public class FajpDuplicateElement {
    public static void main(String[] args) {

        String [] a = {"java", "c", "c++", "python", "java"};
        //approach 1
        boolean flag = false;

        for (int i = 0; i < a.length; i++){

            for (int j = i + 1; j < a.length; j++){

                if (a[i].equals(a[j])){     //with .equals() or ==

                    System.out.println("found duplicate element: " + a[i]);
                    flag = true;
                }
            }
        }
        if (!flag){
            System.out.println("Duplicate element not found");
        }
        System.out.println();
        //hash set approach
        System.out.println("Hash set approach");
        HashSet <String> langs = new HashSet<>();

        System.out.println(langs.add("java"));
        System.out.println(langs.add("python"));
        System.out.println(langs.add("java"));
        System.out.println();
        //boolean flag = false;
        for (String l : a){
            if (!langs.add(l)){
                System.out.println("found duplicate element: " + l);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Duplicate element not found");
        }
    }
}
