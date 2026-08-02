package fajp;
//howw to remove junk / special chars in  string.


public class FajpRemoveJunk {
    public static void main(String[] args) {

    String s = "a*?@##$%^&&* latin string 01234567890";
    String s1 = "#@$%^% Testing %^$^$@^^$$%^&%#$%# Selenium &^%&#%^@%&@^ Java ";

    s = s.replaceAll("[^a - zA-Z0-9]", " ");

        System.out.println(s);
        s1 = s1.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(s1);
    }
}
