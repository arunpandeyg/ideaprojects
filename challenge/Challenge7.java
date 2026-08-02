package challenge;

public class Challenge7 {    //integer conversion

    public static void main(String[] args) {
        int x;
        int y;
        try{
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            System.out.println(x+y);
        }
        catch(Exception e){
            System.out.println("Error: Enter please Integer not String on Command Line, ");
        }
    }

}
