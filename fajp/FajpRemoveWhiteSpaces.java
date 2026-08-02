package fajp;
//how to remove white spaces in a string.
public class FajpRemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "  Java    Programming   Selenium    Automation";
        System.out.println("Before removing the white spaces: "+str);

        str = str.replaceAll("\\s", "");
        System.out.println("After removing the white spaces: "+str);
    }
}
