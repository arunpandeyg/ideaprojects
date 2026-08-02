package challenge;

public class Challenge35 {     //duplicate string share the same memory location.
    public static void main(String[] args) {
        String s1 = "Rudra";
        String s2 = "Rudra";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s2.concat("pandey").hashCode());
    }
}
//.............................................................

class SamMemory{
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        System.out.println(s1==s2);
        s1=s2.concat("EFGH");
        System.out.println(s1==s2);
    }
}
