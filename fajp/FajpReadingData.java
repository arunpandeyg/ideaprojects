package fajp;
//Reading data from text file

import java.io.*;
import java.util.Scanner;

//first approach using file reader and buffer reader
public class FajpReadingData {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\SeleniumPractice\\Test.txt");
        BufferedReader br = new BufferedReader(fr);

        String str ;

        while ((str = br.readLine()) != null){
            System.out.println("str");
        }
        br.close();
    }
}

class FilRe{    //approach 2 using scanner and file
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("\"C:\\Users\\arunp_7\\OneDrive\\Desktop\\Java Practice.txt\"");
        Scanner sc = new Scanner(file);
        //loop statement
        while (sc.hasNextLine()){
            System.out.println(sc.nextInt());
        }


    }
}
class FR{  //approach 3
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\arunp_7\\OneDrive\\Desktop");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
